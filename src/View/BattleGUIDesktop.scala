package View
import javafx.event._
import play.api.libs.json.{JsValue, Json}
import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene
import scalafx.scene.control.Button
import scalafx.scene.image.{Image, ImageView}
import scalafx.scene.layout.HBox
import scalafx.scene.paint.Color
import scalafx.scene.shape.Rectangle



class BattleGUIDesktop() extends EventHandler[ActionEvent] {
  override def handle(Event: ActionEvent): Unit = {

    val jsonGameState: String = """{"playerParty":{"characters":

          [{"name":"Warrior","hp":500,"maxHP":1000","battleOptions":

          ["Sword_Attack","Lunge","RollingAttack","BackStab"]},

          {"name":"Mage","hp":500,"maxHP":1000","battleOptions":
          ["Soul_Destroyer","Soul_Eraser","Dark_Crystal","Black_Vortex"]},

          "EnemyParty":{"characters":

          [{"name":"Mage","hp":0,"maxHP":900","battleOptions":
          ["Soul_Destroyer","Soul_Eraser","Dark_Crystal","Black_Vortex"]},

          {"name":"Warrior","hp":0,"maxHP":1000","battleOptions":
          ["Sword_Attack","Lunge","RollingAttack","BackStab"]}""""




      //val jsonGameState = objects.apply(0).toString

      val parsed: JsValue = Json.parse(jsonGameState)

      BattleGUIDesktop.button1.text = "Mage\n" + (parsed \ "PlayerParty" \ "name" \ "hp" ).as[Int].toString + "\n" + (parsed \ "PlayerParty" \ "Mage" \ "maxHP").as[Int].toString+ "\n" + (parsed \ "PlayerParty" \ "Mage" \ "maxHP" \ 0).as[String].toString


      BattleGUIDesktop.button2.text = "Mage\n" + (parsed \ "PlayerParty" \ "name" \ "hp" ).as[Int].toString + "\n" + (parsed \ "PlayerParty" \ "Mage" \ "maxHP").as[Int].toString+ "\n" + (parsed \ "PlayerParty" \ "Mage" \ "maxHP" \ 0).as[String].toString


      BattleGUIDesktop.button3.text = "Warrior\n" + (parsed \ "PlayerParty" \ "name" \ "hp" ).as[Int].toString + "\n" + (parsed \ "PlayerParty" \ "Warrior" \ "maxHP").as[Int].toString+ "\n" + (parsed \ "PlayerParty" \ "Mage" \ "maxHP" \ 0).as[String].toString


      BattleGUIDesktop.button4.text = "Warrior\n" + (parsed \ "PlayerParty" \ "name" \ "hp" ).as[Int].toString + "\n" + (parsed \ "PlayerParty" \ "Warrior" \ "maxHP").as[Int].toString+ "\n" + (parsed \ "PlayerParty" \ "Mage" \ "maxHP" \ 0).as[String].toString

      println(jsonGameState)


      // TODO: Display the game state on your GUI
      // You must display: current gold, and the name, number owned, and cost for each type of equipment

      // You can access any variables/methods in the DesktopGUI object from this class
      // ex. DesktopGUI.goldTextField.text = goldFromGameState

    }

  }

object BattleGUIDesktop extends JFXApp {
  //javafx.scene.layout.BackgroundImage
  //BackgroundImage = New ImageView(view1)

  val button1: Button = new Button {
    style = "-fx-font: 24 Impact;"
    text = "Player:Mage"
    //onAction = new Buttons1("Mage")
    //onAction = new Buttons1.color.Red
  }
  val button2: Button = new Button {
    style = "-fx-font: 24 Impact;"
    text = "Player:Warrior"
    //onAction = new Buttons1("Warrior")
  }
  val button3: Button = new Button {
    style = "-fx-font: 24 Impact;"
    text = "Player:Mage"
    //onAction = new Buttons1("Mage")
  }
  val button4: Button = new Button {
    style = "-fx-font: 24 Impact;"
    text = "Player:Warrior"
    //onAction = new Buttons1("Warrior")
  }
  val button5: Button = new Button {
    style = "-fx-font: 24 Impact;"
    text = "Enemy:Mage"
    //onAction = new Buttons1("Mage")
  }
  val button6: Button = new Button {
    style = "-fx-font: 24 Impact;"
    text = "Enemy:Warrior"
    //onAction = new Buttons1("Warrior")
  }
  val button7: Button = new Button {
    style = "-fx-font: 24 Impact;"
    text = "Enemy:Mage"
    //onAction = new Buttons1("Mage")
  }
  val button8: Button = new Button {
    style = "-fx-font: 24 Impact;"
    text = "Enemy:Warrior"
    //onAction = new Buttons1("Warrior")
  }
  val SpaceButton: Button = new Button {
    style = "-fx-font: 30 Impact;"
    text = "Battle!"
    //onAction = new Buttons1("Warrior")
  }

  val img = new Image("https://images.app.goo.gl/QynfgZZ3inFJwWJp9")
  val view1 = new ImageView(img)
 // val button = new Button("Mage")
  //val button2 = new Button("Warrior")
  //val button3 = new Button("Mage")
  //val button4 = new Button("Warrior")
  var Character1 = new Rectangle() {
    x = 250
    y = 200
    width = 40
    height = 40
    fill = Color.Blue
  }
  var Character2 = new Rectangle() {
    x = 250
    y = 300
    width = 40
    height = 40
    fill = Color.OrangeRed
  }
  var Character3 = new Rectangle() {
    x = 250
    y = 400
    width = 40
    height = 40
    fill = Color.GhostWhite
  }
  var Character4 = new Rectangle() {
    x = 250
    y = 500
    width = 40
    height = 40
    fill = Color.GhostWhite
  }
  var Character5 = new Rectangle() {
    x = 1150
    y = 200
    width = 40
    height = 40
    fill = Color.Yellow
  }
  var Character6 = new Rectangle() {
    x = 1150
    y = 300
    width = 40
    height = 40
    fill = Color.Orange
  }
  var Character7 = new Rectangle() {
    x = 1150
    y = 400
    width = 40
    height = 40
    fill = Color.GhostWhite
  }
  var Character8 = new Rectangle() {
    x = 1150
    y = 500
    width = 40
    height = 40
    fill = Color.GhostWhite
  }

  val H_Box: HBox = new HBox() {
    children = List(button1, button2, button3, button4, SpaceButton, button5, button6, button7, button8, view1)
  }
  stage = new JFXApp.PrimaryStage {
    title = "Battle GUI"
    scene = new Scene(800, 600) {

      fill = Color.RoyalBlue
      //button.layoutX = 0
      //button.layoutY = 100
      content = List(H_Box, Character1, Character2,Character3,Character4,Character5,Character6,Character7,Character8)

        //def when(hover: ReadOnlyBooleanProperty) = Red

        //fill <== when (hover) choose Green otherwise Red
    }


    def animate(Mage:String, Warrior:String): Unit = {

    }
  }

      /*case "Warrior_press" => BattleGUIDesktop.("shovel")
      case "Mage_press" => BattleGUIDesktop.buyEquipment("excavator")
      case "SoulDestroyer_press" => BattleGUIDesktop.buyEquipment("mine")
      case "SoulEraser_press" => BattleGUIDesktop.clickGold()
      case "DarkCrystal_press" => BattleGUIDesktop.("shovel")
      case "BlackVortex_press" => BattleGUIDesktop.buyEquipment("excavator")

    }
      buttonpressed2 match {
      case "Warrior_press" => BattleGUIDesktop.TakeAction("Warrior")
      case "SwordAttack_press" => BattleGUIDesktop.buyEquipment("mine")
      case "Lunge_press" => BattleGUIDesktop.clickGold()
      case "RollingAttack_press" => BattleGUIDesktop.("shovel")
      case "BackStab_press" => BattleGUIDesktop.buyEquipment("excavator")

  }*/
}


