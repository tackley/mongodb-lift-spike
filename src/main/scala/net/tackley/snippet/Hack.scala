package net.tackley.snippet

import xml.NodeSeq
import net.liftweb.http.SHtml
import net.tackley.model.ApiKey
import org.bson.types.ObjectId
import java.util.Date

class Hack {
  def buttons(xhtml: NodeSeq): NodeSeq = {
    SHtml.submit("create", () => {
      println("creating!")
      val apiKey = ApiKey(ObjectId.get.toString, "tackers2", "internal", Some(new Date))
      apiKey.save
      println("saved!")
    })
  }

}