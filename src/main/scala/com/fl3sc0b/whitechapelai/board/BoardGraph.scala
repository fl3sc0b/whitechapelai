  package com.fl3sc0b.whitechapelai.board

  import scala.collection.immutable.Stream.Empty

  object Conventions {
  val CIRCLEBOX_SEPARATOR: Char = ','
  val SQUAREBOX_COUNTER_SEPARATOR: Char = '.'
  val SQUAREBOX_SYMMETRY_SEPARATOR: Char = '*'
}

object BoardGraph {
  val squareBoxesRepository: List[SquareBox] = List[SquareBox](
    SquareBox(id="0.2",yellow=false,List(),2),
    SquareBox(id="0.3",yellow=false,List(),3),
    SquareBox(id="1,26.1",yellow=false,List("1","26"),1),
    SquareBox(id="1,7.1",yellow=false,List("1","7"),1),
    SquareBox(id="10,30.1",yellow=false,List("10","30"),1),
    SquareBox(id="100,122.2",yellow=false,List("100","122"),2),
    SquareBox(id="100.2",yellow=false,List("100"),2),
    SquareBox(id="101,126.2",yellow=true,List("101","126"),2),
    SquareBox(id="102,127,143.1",yellow=false,List("102","127","143"),1),
    SquareBox(id="103,127,128.0",yellow=false,List("103","127","128"),0),
    SquareBox(id="104,105,130.1",yellow=false,List("104","105","130"),1),
    SquareBox(id="104,129.1",yellow=false,List("104","129"),1),
    SquareBox(id="104,145.0",yellow=false,List("104","145"),0),
    SquareBox(id="105,106,107.1",yellow=false,List("105","106","107"),1),
    SquareBox(id="106,108.1",yellow=false,List("106","108"),1),
    SquareBox(id="108,110,132.1",yellow=false,List("108","110","132"),1),
    SquareBox(id="109.2",yellow=false,List("109"),2),
    SquareBox(id="110,111.1",yellow=false,List("110","111"),1),
    SquareBox(id="111,134,147.0",yellow=false,List("111","134","147"),0),
    SquareBox(id="112,113.1",yellow=false,List("112","113"),1),
    SquareBox(id="112,135.1",yellow=false,List("112","135"),1),
    SquareBox(id="113,114.2",yellow=false,List("113","114"),2),
    SquareBox(id="114,115,137.0",yellow=false,List("114","115","137"),0),
    SquareBox(id="115,116.1",yellow=false,List("115","116"),1),
    SquareBox(id="116.1",yellow=false,List("116"),1),
    SquareBox(id="117.1",yellow=false,List("117"),1),
    SquareBox(id="118,119,120.2",yellow=true,List("118","119","120"),2),
    SquareBox(id="118.3",yellow=false,List("118"),3),
    SquareBox(id="119,121.1",yellow=false,List("119","121"),1),
    SquareBox(id="12,13.1",yellow=false,List("12","13"),1),
    SquareBox(id="121.1",yellow=false,List("121"),1),
    SquareBox(id="121.2",yellow=false,List("121"),2),
    SquareBox(id="122,123.1",yellow=false,List("122","123"),1),
    SquareBox(id="123,125.4",yellow=false,List("123","125"),4),
    SquareBox(id="124.1",yellow=false,List("124"),1),
    SquareBox(id="124.2",yellow=false,List("124"),2),
    SquareBox(id="125,126.1",yellow=false,List("125","126"),1),
    SquareBox(id="128,143,144.1",yellow=false,List("128","143","144"),1),
    SquareBox(id="129,144,145.1",yellow=false,List("129","144","145"),1),
    SquareBox(id="13,14,32.1",yellow=false,List("13","14","32"),1),
    SquareBox(id="130,145.2",yellow=true,List("130","145"),2),
    SquareBox(id="131,146.1",yellow=false,List("131","146"),1),
    SquareBox(id="131.2",yellow=false,List("131"),2),
    SquareBox(id="132,133,134.1",yellow=false,List("132","133","134"),1),
    SquareBox(id="133,146,147.0",yellow=false,List("133","146","147"),0),
    SquareBox(id="135,136,148.1",yellow=false,List("135","136","148"),1),
    SquareBox(id="136,149.1",yellow=false,List("136","149"),1),
    SquareBox(id="137,138.1",yellow=false,List("137","138"),1),
    SquareBox(id="138,164.2",yellow=false,List("138","164"),2),
    SquareBox(id="139,150.3",yellow=false,List("139","150"),3),
    SquareBox(id="139,164.1",yellow=true,List("139","164"),1),
    SquareBox(id="14,33,54.1",yellow=false,List("14","33","54"),1),
    SquareBox(id="140,154.1",yellow=false,List("140","154"),1),
    SquareBox(id="140.2",yellow=false,List("140"),2),
    SquareBox(id="141,155.1",yellow=false,List("141","155"),1),
    SquareBox(id="141,170.1",yellow=false,List("141","170"),1),
    SquareBox(id="142,143.1",yellow=false,List("142","143"),1),
    SquareBox(id="142,156.1",yellow=false,List("142","156"),1),
    SquareBox(id="143.3",yellow=false,List("143"),3),
    SquareBox(id="145,160.0",yellow=false,List("145","160"),0),
    SquareBox(id="148,149.1",yellow=false,List("148","149"),1),
    SquareBox(id="148,162.1",yellow=false,List("148","162"),1),
    SquareBox(id="15,33,34.1",yellow=false,List("15","33","34"),1),
    SquareBox(id="15.2",yellow=false,List("15"),2),
    SquareBox(id="150.2",yellow=false,List("150"),2),
    SquareBox(id="151,153.2",yellow=false,List("151","153"),2),
    SquareBox(id="151.1",yellow=false,List("151"),1),
    SquareBox(id="151.2",yellow=false,List("151"),2),
    SquareBox(id="152,153.2",yellow=false,List("152","153"),2),
    SquareBox(id="152,166.1",yellow=false,List("152","166"),1),
    SquareBox(id="154,168,169,170.0",yellow=false,List("154","168","169","170"),0),
    SquareBox(id="155,182.1",yellow=false,List("155","182"),1),
    SquareBox(id="156,157.1",yellow=false,List("156","157"),1),
    SquareBox(id="157,158.2",yellow=false,List("157","158"),2),
    SquareBox(id="158.1",yellow=false,List("158"),1),
    SquareBox(id="159,160,173.1",yellow=false,List("159","160","173"),1),
    SquareBox(id="159,172.1",yellow=false,List("159","172"),1),
    SquareBox(id="159.1",yellow=false,List("159"),1),
    SquareBox(id="159.2",yellow=false,List("159"),2),
    SquareBox(id="16,17.1",yellow=false,List("16","17"),1),
    SquareBox(id="16,35,36.1",yellow=false,List("16","35","36"),1),
    SquareBox(id="160.1",yellow=false,List("160"),1),
    SquareBox(id="161.1*0",yellow=false,List("161"),1,0),
    SquareBox(id="161.1*1",yellow=false,List("161"),1,1),
    SquareBox(id="161.1*2",yellow=false,List("161"),1,2),
    SquareBox(id="162,163.1",yellow=false,List("162","163"),1),
    SquareBox(id="163,174.2",yellow=false,List("163","174"),2),
    SquareBox(id="164,174.2",yellow=false,List("164","174"),2),
    SquareBox(id="165,167.2",yellow=false,List("165","167"),2),
    SquareBox(id="165,177.1",yellow=false,List("165","177"),1),
    SquareBox(id="166,176.1",yellow=false,List("166","176"),1),
    SquareBox(id="167,178,179.0",yellow=false,List("167","178","179"),0),
    SquareBox(id="168,180.1",yellow=false,List("168","180"),1),
    SquareBox(id="169,181.1",yellow=false,List("169","181"),1),
    SquareBox(id="17,18.1",yellow=false,List("17","18"),1),
    SquareBox(id="17,36,38.1",yellow=false,List("17","36","38"),1),
    SquareBox(id="170,181.1",yellow=false,List("170","181"),1),
    SquareBox(id="171,183.1",yellow=false,List("171","183"),1),
    SquareBox(id="171,185.2",yellow=false,List("171","185"),2),
    SquareBox(id="172,185.1",yellow=false,List("172","185"),1),
    SquareBox(id="173,195.2",yellow=false,List("173","195"),2),
    SquareBox(id="175.1",yellow=false,List("175"),1),
    SquareBox(id="175.2",yellow=false,List("175"),2),
    SquareBox(id="176.2",yellow=false,List("176"),2),
    SquareBox(id="177,178.1",yellow=false,List("177","178"),1),
    SquareBox(id="178,189.1",yellow=false,List("178","189"),1),
    SquareBox(id="18,19,39.0",yellow=false,List("18","19","39"),0),
    SquareBox(id="18.1",yellow=false,List("18"),1),
    SquareBox(id="180,191.1",yellow=false,List("180","191"),1),
    SquareBox(id="182,183,192.1",yellow=false,List("182","183","192"),1),
    SquareBox(id="183,184.2",yellow=false,List("183","184"),2),
    SquareBox(id="183,185.1",yellow=false,List("183","185"),1),
    SquareBox(id="184,192.1",yellow=false,List("184","192"),1),
    SquareBox(id="185,187.3",yellow=false,List("185","187"),3),
    SquareBox(id="185.2",yellow=false,List("185"),2),
    SquareBox(id="186,187.1",yellow=false,List("186","187"),1),
    SquareBox(id="186,193.1",yellow=false,List("186","193"),1),
    SquareBox(id="188.2*0",yellow=false,List("188"),2,0),
    SquareBox(id="188.2*1",yellow=false,List("188"),2,1),
    SquareBox(id="19,20.1",yellow=false,List("19","20"),1),
    SquareBox(id="190,191.1",yellow=false,List("190","191"),1),
    SquareBox(id="190.1",yellow=false,List("190"),1),
    SquareBox(id="193,194.1",yellow=false,List("193","194"),1),
    SquareBox(id="193.2",yellow=false,List("193"),2),
    SquareBox(id="194,195.1",yellow=false,List("194","195"),1),
    SquareBox(id="2,3.1",yellow=false,List("2","3"),1),
    SquareBox(id="2.2",yellow=false,List("2"),2),
    SquareBox(id="20,40.1",yellow=false,List("20","40"),1),
    SquareBox(id="21.1",yellow=false,List("21"),1),
    SquareBox(id="21.2",yellow=false,List("21"),2),
    SquareBox(id="22,23.1",yellow=false,List("22","23"),1),
    SquareBox(id="22,42.0",yellow=false,List("22","42"),0),
    SquareBox(id="23.1",yellow=false,List("23"),1),
    SquareBox(id="24,25.1",yellow=false,List("24","25"),1),
    SquareBox(id="24.1",yellow=false,List("24"),1),
    SquareBox(id="25,44.1",yellow=false,List("25","44"),1),
    SquareBox(id="26,27,44.1",yellow=false,List("26","27","44"),1),
    SquareBox(id="27,28.1",yellow=false,List("27","28"),1),
    SquareBox(id="29,30,50.1",yellow=true,List("29","30","50"),1),
    SquareBox(id="29.1",yellow=false,List("29"),1),
    SquareBox(id="3,4,5.0",yellow=false,List("3","4","5"),0),
    SquareBox(id="30.1",yellow=false,List("30"),1),
    SquareBox(id="31,32.2",yellow=false,List("31","32"),2),
    SquareBox(id="31,50.1",yellow=false,List("31","50"),1),
    SquareBox(id="31,52.0",yellow=false,List("31","52"),0),
    SquareBox(id="34,55.2",yellow=true,List("34","55"),2),
    SquareBox(id="35,37.1",yellow=false,List("35","37"),1),
    SquareBox(id="37,38,39.0",yellow=false,List("37","38","39"),0),
    SquareBox(id="39,56.0",yellow=false,List("39","56"),0),
    SquareBox(id="4,11,12.1",yellow=false,List("4","11","12"),1),
    SquareBox(id="40,57.2",yellow=true,List("40","57"),2),
    SquareBox(id="41,42,58.1",yellow=false,List("41","42","58"),1),
    SquareBox(id="41.2",yellow=false,List("41"),2),
    SquareBox(id="42.1",yellow=false,List("42"),1),
    SquareBox(id="43.1*0",yellow=false,List("43"),1,0),
    SquareBox(id="43.1*1",yellow=false,List("43"),1,1),
    SquareBox(id="44,46.2",yellow=false,List("44","46"),2),
    SquareBox(id="44,59.2",yellow=false,List("44","59"),2),
    SquareBox(id="44.3",yellow=false,List("44"),3),
    SquareBox(id="45,46,47.1",yellow=false,List("45","46","47"),1),
    SquareBox(id="45,47,61.1",yellow=false,List("45","47","61"),1),
    SquareBox(id="46,48.3",yellow=false,List("46","48"),3),
    SquareBox(id="47,61.1",yellow=false,List("47","61"),1),
    SquareBox(id="48,49.1",yellow=false,List("48","49"),1),
    SquareBox(id="48,62.1",yellow=false,List("48","62"),1),
    SquareBox(id="49,50.2",yellow=false,List("49","50"),2),
    SquareBox(id="5.2",yellow=false,List("5"),2),
    SquareBox(id="51,52.1",yellow=false,List("51","52"),1),
    SquareBox(id="51,67.1",yellow=false,List("51","67"),1),
    SquareBox(id="52,53,67.0",yellow=false,List("52","53","67"),0),
    SquareBox(id="52,54.1",yellow=false,List("52","54"),1),
    SquareBox(id="53,54.2",yellow=false,List("53","54"),2),
    SquareBox(id="53,68.1",yellow=false,List("53","68"),1),
    SquareBox(id="55.2",yellow=false,List("55"),2),
    SquareBox(id="56,57.0",yellow=false,List("56","57"),0),
    SquareBox(id="56.1",yellow=false,List("56"),1),
    SquareBox(id="58,73.1*0",yellow=false,List("58","73"),1,0),
    SquareBox(id="58,73.1*1",yellow=false,List("58","73"),1,1),
    SquareBox(id="59,60.1",yellow=false,List("59","60"),1),
    SquareBox(id="6,24,25.1",yellow=false,List("6","24","25"),1),
    SquareBox(id="6.2",yellow=false,List("6"),2),
    SquareBox(id="60.1",yellow=false,List("60"),1),
    SquareBox(id="62,80,82.1",yellow=false,List("62","80","82"),1),
    SquareBox(id="63,64.2",yellow=false,List("63","64"),2),
    SquareBox(id="63,65,82.1",yellow=false,List("63","65","82"),1),
    SquareBox(id="64,66.1",yellow=false,List("64","66"),1),
    SquareBox(id="65,66.2",yellow=false,List("65","66"),2),
    SquareBox(id="65,83.1",yellow=false,List("65","83"),1),
    SquareBox(id="68,86.2",yellow=false,List("68","86"),2),
    SquareBox(id="68.1",yellow=false,List("68"),1),
    SquareBox(id="69,102.1",yellow=false,List("69","102"),1),
    SquareBox(id="69,127.0",yellow=false,List("69","127"),0),
    SquareBox(id="69,70,103.0",yellow=false,List("69","70","103"),0),
    SquareBox(id="7,26.2",yellow=false,List("7","26"),2),
    SquareBox(id="70,71,87.0",yellow=false,List("70","71","87"),0),
    SquareBox(id="71,104.0",yellow=false,List("71","104"),0),
    SquareBox(id="71,72,88.0",yellow=false,List("71","72","88"),0),
    SquareBox(id="72,73,74.1",yellow=false,List("72","73","74"),1),
    SquareBox(id="74,75,76.1",yellow=false,List("74","75","76"),1),
    SquareBox(id="75,90.2",yellow=false,List("75","90"),2),
    SquareBox(id="76,77.1",yellow=false,List("76","77"),1),
    SquareBox(id="77.1",yellow=false,List("77"),1),
    SquareBox(id="78,79,80,97.0",yellow=false,List("78","79","80","97"),0),
    SquareBox(id="78,79.1",yellow=false,List("78","79"),1),
    SquareBox(id="78,96.1",yellow=false,List("78","96"),1),
    SquareBox(id="79.1",yellow=false,List("79"),1),
    SquareBox(id="8,26,28.1",yellow=false,List("8","26","28"),1),
    SquareBox(id="8,9,10.0",yellow=false,List("8","9","10"),0),
    SquareBox(id="80,81.0",yellow=false,List("80","81"),0),
    SquareBox(id="81,118.0",yellow=false,List("81","118"),0),
    SquareBox(id="83.1",yellow=false,List("83"),1),
    SquareBox(id="84.1*0",yellow=false,List("84"),1,0),
    SquareBox(id="84.1*1",yellow=false,List("84"),1,1),
    SquareBox(id="85,101,126.1",yellow=false,List("85","101","126"),1),
    SquareBox(id="85,86.1",yellow=false,List("85","86"),1),
    SquareBox(id="87.1",yellow=false,List("87"),1),
    SquareBox(id="88.1",yellow=false,List("88"),1),
    SquareBox(id="89,90.1",yellow=false,List("89","90"),1),
    SquareBox(id="89,91.1",yellow=false,List("89","91"),1),
    SquareBox(id="9,11.1",yellow=false,List("9","11"),1),
    SquareBox(id="9.2",yellow=false,List("9"),2),
    SquareBox(id="91,92,93.1",yellow=false,List("91","92","93"),1),
    SquareBox(id="92,107,109.1",yellow=false,List("92","107","109"),1),
    SquareBox(id="93,94.1",yellow=false,List("93","94"),1),
    SquareBox(id="94.2",yellow=false,List("94"),2),
    SquareBox(id="95.2*0",yellow=false,List("95"),2,0),
    SquareBox(id="95.2*1",yellow=false,List("95"),2,1),
    SquareBox(id="96,114.1",yellow=false,List("96","114"),1),
    SquareBox(id="96,97.1",yellow=false,List("96","97"),1),
    SquareBox(id="97,117.0",yellow=false,List("97","117"),0),
    SquareBox(id="98.1*0",yellow=false,List("98"),1,0),
    SquareBox(id="98.1*1",yellow=false,List("98"),1,1),
    SquareBox(id="99,100,120.1",yellow=false,List("99","100","120"),1),
    SquareBox(id="99.2",yellow=false,List("99"),2)
  )

  val circleBoxesRepository: List[CircleBox] = List[CircleBox](
    CircleBox("1",1,false,List("1,7.1", "1,26.1")),
    CircleBox("2",2,false,List("2.2", "2,3.1")),
    CircleBox("3",3,true,List("2,3.1", "3,4,5.0")),
    CircleBox("4",4,false,List("3,4,5.0", "4,11,12.1")),
    CircleBox("5",5,false,List("3,4,5.0", "5.2")),
    CircleBox("6",6,false,List("6.2", "6,24,25.1")),
    CircleBox("7",7,false,List("1,7.1", "7,26.2")),
    CircleBox("8",8,false,List("8,9,10.0", "8,26,28.1")),
    CircleBox("9",9,false,List("8,9,10.0", "9,11.1")),
    CircleBox("10",10,false,List("8,9,10.0", "10,30.1")),
    CircleBox("11",11,false,List("4,11,12.1", "9,11.1")),
    CircleBox("12",12,false,List("4,11,12.1", "12,13.1")),
    CircleBox("13",13,false,List("12,13.1", "13,14,32.1")),
    CircleBox("14",14,false,List("13,14,32.1", "14,33,54.1")),
    CircleBox("15",15,false,List("15.2", "15,33,34.1")),
    CircleBox("16",16,false,List("16,17.1", "16,35,36.1")),
    CircleBox("17",17,false,List("16,17.1", "17,18.1", "17,36,38.1")),
    CircleBox("18",18,false,List("17,18.1", "18.1", "18,19,39.0")),
    CircleBox("19",19,false,List("18,19,39.0", "19,20.1")),
    CircleBox("20",20,false,List("19,20.1", "20,40.1"))
  )

  val connections= Map[String, List[Box]](
    "1" -> (oppositeBoxesConnections("1") ::: List.empty)//,
    //"24.1" -> (oppositeBoxesConnections("24.1") ::: squareBoxesRepository.filter(x => x.id == "6.2")),
    //"26" -> (oppositeBoxesConnections("26") ::: circleBoxesRepository.filter(x => x.id == "28"))
  )

  def oppositeBoxesConnections(id: String): List[Box] = {
    if (id.contains(Conventions.SQUAREBOX_COUNTER_SEPARATOR)) {
      squareBoxesRepository.filter(x => x.id == id).head.adjacentCircles.map(x => circleBoxesRepository.filter(
        y => y.id == x).head)
    } else {
      circleBoxesRepository.filter(x => x.id == id).head.adjacentSquares.map(x => squareBoxesRepository.filter(
        y => y.id == x).head)
    }
  }
}