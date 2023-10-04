package personnage

import item.Bombe
import item.Item
import item.Potion

class Personnage(
    val nom: String,
    var pointDeVie: Int,
    val pointDeVieMax: Int,
    var attaque: Int,
    var defense: Int,
    var endurance: Int,
    var vitesse: Int,
    var armePrincipal: Arme?,
    var armure: Armure?,
    val inventaire: MutableList<Item> = mutableListOf()
) {

     fun avoirPotion(): Boolean{
         for (elt in this.inventaire) {
             if (elt is Potion) {
                 return true
             }
         }
         return false
     }

    fun avoirbombe(): Boolean{
        for (elt in this.inventaire) {
            if (elt is Bombe) {
                return true
            }
        }
        return false
    }

    fun boirePotion(){
        if (avoirPotion() == true){
            var iPremierePotion = -1
            for (i in 0..this.inventaire.lastIndex) {
                if (this.inventaire[i] is Potion) {
                    iPremierePotion = i
                    break
                }
            }
            
        }
    }
     fun calculeDefense():Int{
         //TODO Mission 4.2
        return this.defense/2;
     }

     // Méthode pour attaquer un adversaire
     fun attaque(adversaire: Personnage) {
        //TODO Mission 4.1
       val degats= this.attaque/2
         adversaire.pointDeVie-=degats
        println("$nom attaque ${adversaire.nom} avec une attaque de base et inflige $degats points de dégâts.")
    }
    // Méthode pour passer le tour
     fun passer (adversaire: Personnage) {

         println("${this.nom} passe son tour")

        }




    override fun toString(): String {
        return "$nom (PV: $pointDeVie/$pointDeVieMax, Attaque: $attaque, Défense: $defense, Endurance: $endurance, Vitesse: $vitesse)"
    }


}