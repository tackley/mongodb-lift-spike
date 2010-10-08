



package net.tackley.model

import _root_.net.liftweb.mapper._
import _root_.net.liftweb.util._
import _root_.net.liftweb.common._
import net.liftweb.mongodb.{MongoDocumentMeta, MongoDocument}
import java.util.Date

case class ApiKey(_id: String, username: String, tier: String, lastLogin: Option[Date]) extends MongoDocument[ApiKey] {

  def meta = ApiKey


}
object ApiKey extends MongoDocumentMeta[ApiKey] {

}