package personnage


class Armure (
     private val nom : String,
     private val descripton: String,
    val type:TypeArmure,
    val qualite:Qualite,
    ){

    fun calculProtection():Int {
        val x = this.qualite.bonusQualite + this.type.BonusType
        return x
    }

    fun utiliser(cible: Personnage) {
        println("$nom est utilisée contre ${cible.nom}.")
        // Ici, nous n'avons pas besoin de renvoyer de résultat, nous avons simplement effectué une action.
    }

    }







