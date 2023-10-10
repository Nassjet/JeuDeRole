package personnage


import item.Arme
import item.Armure
import item.Item
import jeu.Jeu
import item.Sort

class Mage constructor(nom: String,
                       val jeu : Jeu,
                       val monstre: Personnage,
                       pointDeVie: Int,
                       pointDeVieMax: Int,
                       attaque: Int,
                       defense: Int,
                       endurance: Int,
                       vitesse: Int,
                       armePrincipal: Arme?,
                       armure: Armure?,
                       inventaire: MutableList<Item> = mutableListOf(),
                       private val grimmoire:MutableList<Sort> = mutableListOf() ) :Personnage(nom, pointDeVie, pointDeVieMax, attaque, defense, endurance, vitesse, armePrincipal, armure, inventaire) {


    fun afficheGrimoire() {
        println("Inventaire du Grimmoire")
        for (i in 1 until this.grimmoire.size) {
            println("$i.${this.grimmoire[i]}")
        }
    }

    fun choisirEtLancerSort() {
        println(afficheGrimoire())

        println("saisir un sort : ")
        val x = readln().toInt() //saisir une valeur disponible

        when (x) {
            0 -> {
                "boule de feu"

                this.jeu.joueur.attaque(monstre)
                //lorsque la valeur est 0 l'action est attaquer
            }

            1 -> {
                "caméa méa"
                this.jeu.joueur.attaque(monstre)

            }

            2 -> {
                "pression spirituelle"
                this.jeu.joueur.attaque(monstre)


            }

        }


    }

    }









