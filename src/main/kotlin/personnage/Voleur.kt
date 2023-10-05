package personnage

import item.Arme
import item.Armure
import item.Item


class Voleur constructor(nom: String,
                         pointDeVie: Int,
                         pointDeVieMax: Int,
                         attaque: Int,
                         defense: Int,
                         endurance: Int,
                         vitesse: Int,
                         armePrincipal: Arme?,
                         armure: Armure?,
                         inventaire: MutableList<Item> = mutableListOf(), ) :Personnage(nom, pointDeVie, pointDeVieMax, attaque, defense, endurance, vitesse, armePrincipal, armure, inventaire){

        fun volerItem(){
    }
}




