package Game1

class Character() {
  var Attack_power: Int = 200
  var Defense: Int = 125
  var Magic_Attack: Int = 225
  var Magic_Defense: Int = 150
  var H_P: Int = 1000

  var Max_magic_points = 500
  var Curr_magic_points: Int = Max_magic_points
  var Dead = true
  var X_P: Int = 0
  var level: Int = 1

  //val Player1 = new CharacterBuilding(Damage: Int, Defense: Int)

  //Trying to figure out whether or not I should add the defense mechanic right into the takeDamage method?

  def takeDamage(Damage: Int): Unit = {
    if (H_P > 0) {
      H_P = H_P - Damage
    }
    if (H_P <= 0) {
      Dead = true

    }
    if (H_P > 0) {
      Dead = false
    }
  }

  //Or keep it here in the Physical Attack Method.

  def PhysicalAttack(Player2: Character): Unit = {
    if (this.Attack_power >= Player2.Defense) {
      Player2.takeDamage(this.Attack_power - Player2.Defense)
      Player2.Defense = 0
    }
    else {
      Player2.Defense -= this.Attack_power
    }
    if(Player2.Dead){
      this.experience(Player2)
    }
  }

  def MagicAttack(Player2: Character): Unit = {
    if (this.Magic_Attack >= Player2.Magic_Defense && this.Curr_magic_points >= 100) {
      Player2.takeDamage(this.Magic_Attack - Player2.Magic_Defense)
      Player2.Magic_Defense = 0
      this.Max_magic_points -= 100
    }
    else if (this.Curr_magic_points <= 100) {
    }
    else {
      Player2.Magic_Defense -= this.Magic_Attack
      this.Curr_magic_points -= 100
    }
    if(Player2.Dead){
      this.experience(Player2)
    }

  }


  //going to add negative defense to curr_H_P after Player2 attack power is greater than defense.

  def reset(): Unit = {
    this.H_P = 1000
  }


//Gained experience points is equal to the defense of the defending player only if they are dead
// (since that means your attacks slayed them)
  def experience(Player2:Character): Unit = {

    this.X_P += Player2.Defense
    while(X_P > ((level + 1) * 250))
      X_P -= ((level + 1) * 250)
      this.levelUp()
  }

  def levelUp(): Unit = {
    level += 1
    Attack_power += 10
    Defense += 10
    Magic_Attack += 10
    Magic_Defense+= 10
    H_P += 10
    Max_magic_points += 10
    Curr_magic_points += 10
    X_P += 10
  }

}



