package Game1

class PartyClass {

  var Character1: Character = new Character
  var Character2: Character = new Character
  var Character3: Character = new Character
  var Character4: Character = new Character
  var Character5: Character = new Character
  var Character6: Character = new Character
  var teamTotalX_P: Int = 0
  var livingWinners: Int = 0
  val Winners: List[Character] = List(Character1, Character2, Character3, Character4, Character5, Character6)

  def party(Losers:List[Character]): Unit = {
    for(i <- Losers){
      teamTotalX_P += Losers(i.Defense).Defense
    }
    for(t <- Winners){
      if(!t.Dead){
        livingWinners += 1
      }
    }
    for( x <- Winners ){
      if(!x.Dead){
        x.X_P += teamTotalX_P / livingWinners
      }
    }

  }
}


