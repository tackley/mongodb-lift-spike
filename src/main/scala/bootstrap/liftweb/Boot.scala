

package bootstrap.liftweb

import _root_.net.liftweb.http.{LiftRules}
import _root_.net.liftweb.sitemap.{SiteMap, Menu, Loc}
import net.liftweb.mongodb.{MongoHost, MongoAddress, DefaultMongoIdentifier, MongoDB}

class Boot {
  def boot {
  
  
    // where to search snippet
    LiftRules.addToPackages("net.tackley")

    // build sitemap
    val entries = List(Menu("Home") / "index") :::
                  Nil
                  
    LiftRules.setSiteMap(SiteMap(entries:_*))

    // set character encoding
    LiftRules.early.append(_.setCharacterEncoding("UTF-8"))

    MongoDB.defineDb(DefaultMongoIdentifier, MongoAddress(MongoHost("127.0.0.1"), "test"))
    
    
  }
}