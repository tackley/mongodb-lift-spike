



package net.tackley.model

import net.liftweb.mongodb.record.{MongoMetaRecord, MongoId, MongoRecord}
import net.liftweb.record.field.{OptionalDateTimeField, StringField}

class ApiKey extends MongoRecord[ApiKey] with MongoId[ApiKey] {

//(_id: String, username: String, tier: String, lastLogin: Option[Date]) extends MongoDocument[ApiKey] {

  object username extends StringField(this, 20)
  object tier extends StringField(this, 10)
  object lastLogin extends OptionalDateTimeField(this)

  def meta = ApiKey


}
object ApiKey extends ApiKey with MongoMetaRecord[ApiKey] {

}