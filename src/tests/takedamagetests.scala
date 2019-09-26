package tests
import Game1.{Character, PartyClass}
import org.scalatest.FunSuite

class takedamagetests extends FunSuite {
  test("testTakeDamage") {
    val obj1: Character = new Character
    val obj2: Character = new Character
    val obj3: Character = new Character
    val obj4: Character = new Character

    obj1.takeDamage(1000)
    obj2.takeDamage(500)
    obj3.takeDamage(1100)
    obj4.takeDamage(0)

    assert(obj1.H_P == 0)
    assert(obj2.H_P == 500)
    assert(obj3.H_P == -100)
    assert(obj4.H_P == 1000)
    assert(obj1.Dead)
    assert(!obj2.Dead)
  }
  test("PhysicalAttackTests") {
    val Player1: Character = new Character
    val Player2: Character = new Character

    Player1.Attack_power = 150
    Player2.Defense = 200
    Player1.PhysicalAttack(Player2)
    assert(Player2.Defense == 50)

    /////////////////////////////

    Player1.Attack_power = 250
    Player2.Defense = 200
    Player1.PhysicalAttack(Player2)
    assert(Player2.H_P == 950)

    /////////////////////////////

    Player1.Attack_power = 1300
    Player2.Defense = 200
    //Player2.H_P = 1000
    Player2.reset()
    Player1.PhysicalAttack(Player2)
    assert(Player2.H_P == -100)

  }
  test("MagicAttackTests") {
    val Player1: Character = new Character
    val Player2: Character = new Character

    Player1.Magic_Attack = 225
    Player2.Magic_Defense = 150
    Player1.Max_magic_points = 500
    Player2.H_P = 1000
    Player2.Defense = 125
    Player1.MagicAttack(Player2)
    assert(Player2.Magic_Defense == 0)
    assert(Player1.Max_magic_points == 400)
    assert(Player2.H_P == 925)
    assert(Player2.Defense == 125 )

    Player2.reset()
    Player1.Magic_Attack = 150
    Player2.Magic_Defense = 225
    Player1.Max_magic_points = 500
    Player2.H_P = 1000
    Player2.Defense = 125
    Player1.MagicAttack(Player2)
    assert(Player2.Magic_Defense == 75)
    assert(Player1.Max_magic_points == 500)
    assert(Player2.H_P == 1000)
    assert(Player2.Defense == 125)

    Player2.reset()
    Player1.Magic_Attack = 150
    Player2.Magic_Defense = 225
    Player1.Curr_magic_points = 99
    Player2.H_P = 1000
    Player2.Defense = 125
    Player1.MagicAttack(Player2)
    assert(Player2.Magic_Defense == 225)
    assert(Player1.Curr_magic_points == 99)
    assert(Player2.H_P == 1000)
    assert(Player2.Defense == 125)


  }
  test("LevelUpTests") {
    val Player1: Character = new Character
    val Player2: Character = new Character


    Player2.Defense = 500
    Player1.Defense = 300
    Player1.X_P = 0
    Player1.level = 1
    Player2.H_P = 1000
    Player1.H_P = 1
    Player1.Attack_power = 1500

    Player1.PhysicalAttack(Player2)
    Player1.MagicAttack(Player2)
    Player1.experience(Player2)

    assert(Player2.Defense == 0)
    assert(Player1.X_P == 40)
    assert(Player2.H_P == 0)
    assert(Player1.level == 5)
    assert(Player1.Attack_power == 1540)
    assert(Player1.Defense == 340)
    assert(Player1.H_P == 41)
  }
  ///////////////////////////////////////

    test("LevelUpTests2"){

      val Player1: Character = new Character
      val Player2: Character = new Character

    Player2.Defense = 500
    Player1.Defense = 100
    Player1.X_P = 0
    Player1.level = 1
    Player2.H_P = 1
    Player1.H_P = 1
    Player1.Attack_power = 200

    Player1.PhysicalAttack(Player2)
    Player1.MagicAttack(Player2)
    Player1.experience(Player2)

    assert(Player2.Defense == 300)
    assert(Player1.X_P == 930)
    assert(Player1.level == 4)
    assert(Player1.Attack_power == 230)
    assert(Player1.Defense == 130)
    assert(Player1.H_P == 31)
  }

    test(testName = "partyTests"){

      var winnerparty: PartyClass = new PartyClass
      var losserparty: PartyClass = new PartyClass

      var Character1: Character = new Character
      var Character2: Character = new Character
      var Character3: Character = new Character
      var Character4: Character = new Character
      var Character5: Character = new Character
      var Character6: Character = new Character

      //Winners.X_P =

      //assert()


    }






    /*Player2.hpreset()
    Player2.Defense = 300
    Player1.Attack_power = 301
    Player1.X_P = 0
    Player1.level = 1
    Player2.H_P = 1

    Player1.MagicAttack(Player2)
    Player1.experience(Player2)
    Player2.Dead = true
    assert(Player2.Defense == 300)
    assert(Player1.X_P == 620)
    assert(Player1.level == 3)*/



    //Player2.hpreset()
    //Player2.Defense =

}
