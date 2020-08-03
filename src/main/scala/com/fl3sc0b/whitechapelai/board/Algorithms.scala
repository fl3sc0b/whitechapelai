package com.fl3sc0b.whitechapelai.board

import scala.collection.mutable

object Algorithms {
  def getAdjacentCircleBoxes(start: CircleBox) : List[CircleBox] = {
    def auxiliar(node: String, finished: mutable.MutableList[String]) : Set[String] = {
      val nodesFromNode : List[Box] = BoardGraph.connections(node)
      finished += node
      nodesFromNode.map {
        case CircleBox(id, _, _, _) => if (!finished.contains(id)) {
          finished += id
          Set(id)
        } else Set("0")
        case SquareBox(id, _, _, _, _) => if (!finished.contains(id)) {
          finished += id
          auxiliar(id, finished)
        } else Set("0")
      }.foldLeft(Set("0"))(_ ++ _) - "0"
    }
    auxiliar(start.id, new mutable.MutableList[String]).map(x => BoardGraph.circleBoxesRepository.filter(_.id == x).head).toList
  }

  def getShortestPathBetweenCircleBoxes(start: CircleBox, end: CircleBox) : List[String] = {
    def bfs_node(node: CircleBox, u: String, dest: String, pred: mutable.ArrayBuffer[String], queue: mutable.Queue[String], visited: mutable.ArrayBuffer[Boolean]): Boolean = {
      if (!visited(node.number)) {
        visited(node.number) = true
        pred(node.number) = u
        queue.enqueue(node.id)
        if (node.id == dest) true else false
      } else false
    }

    @scala.annotation.tailrec
    def bfs(dest: String, pred: mutable.ArrayBuffer[String], queue: mutable.Queue[String], visited: mutable.ArrayBuffer[Boolean]): mutable.ArrayBuffer[String] = {
      if (queue.nonEmpty) {
        val u = queue.dequeue()
        val adj = getAdjacentCircleBoxes(BoardGraph.circleBoxesRepository.filter(_.id == u).head)
        val found = adj.find(x => bfs_node(x, u, dest, pred, queue, visited))
        if (found.isEmpty) bfs(dest, pred, queue, visited)
        else pred
      } else new mutable.ArrayBuffer[String]()
    }

    val pred = new mutable.ArrayBuffer[String](196)
    val visited = new mutable.ArrayBuffer[Boolean](196)
    val queue = new mutable.Queue[String]()

    for (i <- 0 to 195) {
      visited += false
      pred += "-1"
    }

    visited(start.number) = true
    queue.enqueue(start.id)
    val pathArray = bfs(end.id, pred, queue, visited)

    @scala.annotation.tailrec
    def buildPathList(path: List[String], next: Short): List[String] = {
      if (pred(next) == "-1") start.id :: path
      else buildPathList(next.toString :: path, pathArray(next).toShort)
    }

    buildPathList(List.empty[String], end.number)
  }
}
