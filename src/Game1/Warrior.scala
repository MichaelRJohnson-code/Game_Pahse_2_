package Game1
class Warrior extends Character {

  this.Defense = 250

  def Sword_Attack(Player2:Character): Unit = {

    Player2.H_P -= 200
  }

  def Lunge(Player2:Character): Unit = {
    Player2.H_P -= 200

  }
  def RollingAttack(Player2:Character): Unit = {
    Player2.H_P -= 200

  }
  def BackStab(Player2:Character): Unit = {
    Player2.H_P -= 200

  }

  override def battleOptions(Player2: Character):List[String] = {

    List("Sword_Attack","Lunge","RollingAttack","BackStab")

  }
  override def takeAction(Action:String, Player2: Character): Unit = {
    if (battleOptions(this).contains(Action)) {
      Action match {
      case "Sword_Attack" => Sword_Attack(Player2)
      case "Lunge" => Lunge(Player2)
      case "RollingAttack" => RollingAttack(Player2)
      case "BackStab" => BackStab(Player2)
    }
    }

  }

}
