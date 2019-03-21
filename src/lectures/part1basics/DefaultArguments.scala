package lectures.part1basics

object DefaultArguments extends App {

  def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 1080): Unit = println(
    "Saving picture with args: format=" + format + " width=" + width + " height=" + height)

  savePicture()

  savePicture("gif")

  savePicture(width = 800)

  savePicture(height = 600, width = 800, format = "bmp")
}
