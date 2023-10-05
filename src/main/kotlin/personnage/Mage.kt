package personnage


import item.Arme
import item.Armure
import item.Item

class Mage constructor(nom: String,
                       pointDeVie: Int,
                       pointDeVieMax: Int,
                       attaque: Int,
                       defense: Int,
                       endurance: Int,
                       vitesse: Int,
                       armePrincipal: Arme?,
                       armure: Armure?,
                       inventaire: MutableList<Item> = mutableListOf(), ) :Personnage(nom, pointDeVie, pointDeVieMax, attaque, defense, endurance, vitesse, armePrincipal, armure, inventaire) {


        fun afficheGrimoire(){

        }

        fun choisirEtLancerSort() {

        }

    open class Sort(nom: String, effet:Unit){

    }
}



