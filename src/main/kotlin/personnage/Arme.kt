package personnage

import jeu.TirageDes


class Arme(val nom: String, val description: String, val type: TypeArme, val qualité: Qualite, val dégâts: Int){

    fun calculerDegats(){
        val des = TirageDes(this.type.nombreDes, this.type.valeurDeMax)

        // Utilisation de la méthode lance() pour obtenir le résultat du lancé
        val resultat = des.lance()

    }
}
