package com.fl3sc0b.whitechapelai.jack

import com.fl3sc0b.whitechapelai.maths.Random

object AIEngine {

  // Ordered list of possible hideouts for Jack. Generated by Board.HideoutAnalyzer class using these weights:
  //      - Min distance from red box: 0.6
  //      - Standard deviation of distance from red boxes: 0.2
  //      - Number of connections with circle boxes: 0.2
  val hideoutsOrdered: List[(Short, Double)] = List((26,0.9187665564309068), (28,0.9063056432967761), (159,0.8854621669493012), (9,0.8769230769230769),
                             (185,0.873456547435838), (44,0.8712412248725536), (29,0.8707804909121444), (2,0.8615384615384616),
                             (46,0.8596145146848952), (48,0.8499316857261912), (138,0.8498566101686311), (136,0.8498566101686311),
                             (183,0.8426873166666071), (47,0.8318884769128292), (45,0.8318884769128292), (11,0.8288452839156645),
                             (111,0.8267800707745152), (134,0.8264588641232145), (133,0.8264588641232145), (172,0.8225506661345074),
                             (139,0.8209312567378977), (79,0.8176887678483347), (4,0.813460668531049), (66,0.8071660507498921),
                             (146,0.805134207224305), (174,0.8037027640147849), (164,0.8037027640147849), (163,0.8037027640147849),
                             (100,0.7929381751980644), (143,0.791306503211573), (162,0.790168747387094), (5,0.7855956501474973),
                             (63,0.7776710921397751), (171,0.7657642397435303), (157,0.7657642397435303), (51,0.7622864767551598),
                             (82,0.7503796243589149), (67,0.7469018613705444), (142,0.7436933865344368), (20,0.7365940650015794),
                             (42,0.733207430919437), (23,0.7236661536140739), (41,0.7178228155348215), (40,0.7178228155348215),
                             (86,0.7160150982749875), (83,0.7069921921576126), (85,0.6917354029294869), (99,0.6903471673623123),
                             (30,0.6886443123549063), (1,0.6784410688796445), (24,0.6596145146848953), (94,0.6578750815856755),
                             (93,0.6578750815856755), (132,0.6557567480951298), (108,0.6557567480951298), (114,0.6543107386334197),
                             (113,0.6543107386334197), (110,0.6446704510352308), (109,0.6446704510352308), (25,0.64422989930028),
                             (8,0.6421646861591306), (59,0.6400112601429137), (53,0.6379352815191228), (145,0.6313584613063816),
                             (7,0.6264588641232145), (6,0.6264588641232145), (131,0.6252163633128903), (137,0.623541507864189),
                             (112,0.623541507864189), (50,0.6225506661345075), (148,0.6221678752344736), (135,0.6221678752344736),
                             (125,0.6206820644142994), (97,0.6191624549569605), (106,0.6189605403022755), (12,0.6185512814753638),
                             (64,0.6159738459217663), (49,0.6159738459217663), (173,0.6152549709652264), (78,0.6098317479282749),
                             (10,0.6096029019412836), (118,0.6065222138192928), (13,0.6031666660907483), (43,0.5980760531464338),
                             (151,0.5951537120169261), (130,0.5944471325436596), (161,0.5938574139890676), (60,0.5938574139890676),
                             (195,0.593154474641609), (187,0.593154474641609), (52,0.5914061116851074), (123,0.5899128336450686),
                             (122,0.5899128336450686), (170,0.58496613193076), (140,0.58496613193076), (80,0.5815682362706085),
                             (129,0.5798867521301891), (16,0.5797690966323107), (15,0.5797690966323107), (17,0.5791829745434067),
                             (193,0.5759218878269576), (186,0.5759218878269576), (116,0.5718963421936964), (61,0.5703500153743677),
                             (156,0.5623428496526223), (127,0.5623428496526223), (31,0.5606368809158766), (62,0.5601819353213366),
                             (120,0.5582791884567877), (98,0.5582791884567877), (188,0.5570128199369022), (175,0.5570128199369022),
                             (124,0.5541969011615291), (160,0.5537165094267649), (144,0.5513727928567894), (150,0.5489998658630799),
                             (184,0.545152657057727), (73,0.543041440971394), (117,0.5411271114244658), (155,0.5388122857769138),
                             (102,0.5315736188833915), (126,0.5313997136596029), (101,0.5313997136596029), (58,0.5276568255867786),
                             (68,0.5230769230769231), (55,0.5230769230769231), (18,0.5178228155348216), (192,0.5143834262884961),
                             (77,0.51323894904559), (141,0.508043055007683), (128,0.5064907674791248), (182,0.48541977272954534),
                             (56,0.48299498710148697), (22,0.4716689693809754), (92,0.46997878444746755), (19,0.4595779365930815),
                             (91,0.45459416906285216), (57,0.4471303694726523), (95,0.43317521372741014), (96,0.42772208242445475),
                             (90,0.40523184807289847), (107,0.4051163476445369), (33,0.39752663901063556), (75,0.3898472326882831),
                             (104,0.38655059546754617), (54,0.36455447146814796), (105,0.3637983591587913), (89,0.36053727244234235),
                             (36,0.3566251180797054), (35,0.3561528611234916), (34,0.3561528611234916), (115,0.3507990055013778),
                             (152,0.3467843290442183), (194,0.3378696188697722), (32,0.3372599982483556), (14,0.3372599982483556),
                             (166,0.33595931184215455), (190,0.33574894045245607), (176,0.3336152504784645), (88,0.3330291283895605),
                             (153,0.32765682558677867), (121,0.3270909693890784), (119,0.3270909693890784), (74,0.32486946461265026),
                             (87,0.32120944961696407), (37,0.31780706564181305), (180,0.3160150982749875), (72,0.31212534230294153),
                             (38,0.31047127192585927), (168,0.3006304828903722), (154,0.3006304828903722), (76,0.2941002338434195),
                             (181,0.2822205259527609), (169,0.2772738242384522), (81,0.272076788940003), (39,0.26251498485726765),
                             (103,0.24713036947265227), (69,0.24650459346922143), (178,0.143041440971394), (191,0.11618900349877609),
                             (189,0.11369412370017692), (179,0.09830950831556154), (177,0.09688759481754786), (167,0.09688759481754786),
                             (165,0.09688759481754786), (71,0.09410023384341948), (70,0.06096617216025613))

  def chooseHideout(): Short = hideoutsOrdered.reverse(Random.orderedProbabilityUniformlyDistributed(hideoutsOrdered.length))._1
}