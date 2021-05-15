package com.fl3sc0b.whitechapelai.jack

import com.fl3sc0b.whitechapelai.board.{BoardGraph, Box, CircleBox, SquareBox}

import scala.collection.mutable

/** Collection of graph algorithms to be applied on the board */
object Algorithms {
  /**
   * Gets the whole collection of [[com.fl3sc0b.whitechapelai.board.CircleBox]] that are connected with the selected [[com.fl3sc0b.whitechapelai.board.CircleBox]]
   *
   * @param start A [[com.fl3sc0b.whitechapelai.board.CircleBox]] whose connections are being asked for
   * @return A list of [[com.fl3sc0b.whitechapelai.board.CircleBox]] that are connected to the selected [[com.fl3sc0b.whitechapelai.board.CircleBox]]
   */
  def getAdjacentCircleBoxes(start: CircleBox): List[CircleBox] = {
    def auxiliary(node: String, finished: mutable.MutableList[String]): Set[String] = {
      val nodesFromNode: List[Box] = BoardGraph.connections(node)
      finished += node
      nodesFromNode.map {
        case CircleBox(id, _, _, _) => if (!finished.contains(id)) {
          finished += id
          Set(id)
        } else Set("0")
        case SquareBox(id, _, _, _, _) => if (!finished.contains(id)) {
          finished += id
          auxiliary(id, finished)
        } else Set("0")
      }.foldLeft(Set("0"))(_ ++ _) - "0"
    }

    auxiliary(start.id, new mutable.MutableList[String]).map(x => BoardGraph.circleBoxesRepository.filter(_.id == x).head).toList
  }

  /**
   * Gets one of the shortest routes (if there are more than one) between two [[com.fl3sc0b.whitechapelai.board.CircleBox]]
   *
   * @param start Source [[com.fl3sc0b.whitechapelai.board.CircleBox]]
   * @param end   Destination [[com.fl3sc0b.whitechapelai.board.CircleBox]]
   * @return An ordered list of Strings with the names of the [[com.fl3sc0b.whitechapelai.board.CircleBox]] that conform the route
   */
  def getShortestPathBetweenCircleBoxes(start: CircleBox, end: CircleBox): List[String] = {
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

    // Model used to compute the shortest route. Requires initialization
    val pred = new mutable.ArrayBuffer[String](196)
    val visited = new mutable.ArrayBuffer[Boolean](196)
    val queue = new mutable.Queue[String]()

    (0 to 195).map(x => {
      visited += false
      pred += "-1"
    })

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
