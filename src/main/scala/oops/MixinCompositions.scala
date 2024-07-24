package oops

trait GreetingService:
  def translate(text:String):String
  def sayHello = translate("Hello")

trait TranslationService:
  def translate(text:String):String = "Hi"

trait ComposedService extends GreetingService, TranslationService

// In this case the abstract member of GreetingService i.e the translate method
// match automatically with concrete member with TranslationService trait.

class ServiceImpl extends ComposedService

@main
def GreetingServiceDriver():Unit = {
  val compService = ServiceImpl()

  // So every call to translate() will be returned from the concrete implementations
  println(compService.sayHello)
  println(compService.translate("Hi"))
}