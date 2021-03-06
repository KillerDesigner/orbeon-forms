package org.orbeon.dom.tree

import org.orbeon.dom.{Comment, Visitor}

class ConcreteComment(var text: String) extends AbstractNode with WithParent with Comment {

  override def getText               = text
  override def setText(text: String) = this.text = text

  def accept(visitor: Visitor) = visitor.visit(this)

  override def toString = s"""Comment("$text")"""
}
