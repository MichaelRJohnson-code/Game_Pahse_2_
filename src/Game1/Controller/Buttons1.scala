package Game1.Controller
import javafx.event.ActionEvent
import View.BattleGUIDesktop


class Buttons1(buttonpressed:String,buttonpressed2:String) extends EventHandler[ActionEvent] {
    override def handle(e: ActionEvent): Unit = {

        buttonpressed match {
            case "Warrior_press" => BattleGUIDesktop.("")
            case "Mage_press" => BattleGUIDesktop.buyEquipment("")
            case "SoulDestroyer_press" => BattleGUIDesktop.buyEquipment("")
            case "SoulEraser_press" => BattleGUIDesktop.
            case "DarkCrystal_press" => BattleGUIDesktop.("")
            case "BlackVortex_press" => BattleGUIDesktop.buyEquipment("")
        }

        buttonpressed2 match {
            case "Warrior_press" => BattleGUIDesktop.TakeAction("Warrior")
            case "SwordAttack_press" => BattleGUIDesktop.buyEquipment("mine")
            case "Lunge_press" => BattleGUIDesktop.clickGold()
            case "RollingAttack_press" => BattleGUIDesktop.("")
            case "BackStab_press" => BattleGUIDesktop.buyEquipment("")
        }
    }

    def takeTurn(l:String): Unit = {

    }

}*/

/*var jsonString: String = """{"playerParty":{"characters":

[{"name":"character1","hp":500,"maxHP":1000","battleOptions":

["Sword_Attack","Lunge","RollingAttack","BackStab"]},

{"name":"character2","hp":500,"maxHP":1000","battleOptions":
["Soul_Destroyer","Soul_Eraser","Dark_Crystal","Black_Vortex"]},

"EnemyParty":{"characters":

[{"name":"character1","hp":0,"maxHP":900","battleOptions":
["Soul_Destroyer","Soul_Eraser","Dark_Crystal","Black_Vortex"]},

{"name":"character2","hp":0,"maxHP":1000","battleOptions":
["Sword_Attack","Lunge","RollingAttack","BackStab"]}""""*/
