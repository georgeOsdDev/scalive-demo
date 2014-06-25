package demo.action

import xitrum.annotation.GET
import demo.model.Queue

@GET("")
class SiteIndex extends DefaultLayout {
  def execute() {
    Queue.enqueue(System.currentTimeMillis.toString)
    respondView()
  }
}
