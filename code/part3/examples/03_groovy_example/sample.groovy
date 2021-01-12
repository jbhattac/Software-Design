class Worker {
  def work() { println("working...") }
}

class Manager {
  @Delegate Worker worker = new Worker()
}

def bob = new Manager()
bob.work()

