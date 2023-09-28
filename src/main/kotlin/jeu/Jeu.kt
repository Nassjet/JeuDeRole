package jeu

import personnage.Guandao
import personnage.Personnage
import personnage.typeExtraLegendaire


class Jeu(monstres: List<Personnage>) {
    lateinit var joueur: Personnage
     var combats: MutableList<Combat> = mutableListOf()
    var score: Int = 0

    // Corps du constructeur
    init {
        // Lancement de la création du personage du joueur
        this.creerPersonnage()
        // Pour chaque monstre dans la liste de monstres
        for (unMonstre in monstres){
            // On créer un combat
            val unCombat= Combat(this,unMonstre)
            combats.add(unCombat)
        }
    }

    fun lancerCombat() {
        for (unCombat in this.combats) {
            unCombat.executerCombat()
            // Mettre à jour le score en fonction du nombre de tours
            val tours = unCombat.nombreTours
            score += calculerScore(tours)
        }
        println("Score final du joueur: $score")
    }

    private fun calculerScore(tours: Int): Int {
        // Par exemple, vous pouvez attribuer plus de points pour moins de tours
        return 500 - tours * 10
    }

    /**
     *  Méthode pour créer le personnage du joueur en demandant les informations à l'utilisateur
     *
     */
    fun creerPersonnage(): Personnage {
        println("Création de votre personnage:")

        // Demander le nom du personnage à l'utilisateur
        print("Entrez le nom de votre personnage: ")
        val nom = readLine() ?: ""

        var attaque = 0
        var defense = 0
        var endurance = 0
        var vitesse = 0

        // Demander à l'utilisateur de répartir 40 points entre attaque, défense, endurance et vitesse
        var pointsRestants = 40
        while (pointsRestants >= 40) {

            println("Points restants: $pointsRestants") //affichage des points restants

            //attribution des points
            print("Attribuez des points à l'attaque: ")
            val pointsAttaque = readLine()?.toIntOrNull() ?: 0
            print("Attribuez des points à la défense: ")
            val pointsDefense = readLine()?.toIntOrNull() ?: 0
            print("Attribuez des points à l'endurance: ")
            val pointsEndurance = readLine()?.toIntOrNull() ?: 0
            print("Attribuez des points à la vitesse: ")
            val pointsVitesse = readLine()?.toIntOrNull() ?: 0

             pointsRestants = pointsAttaque + pointsDefense + pointsEndurance + pointsVitesse

            if (pointsRestants>40) {
                println("Vous avez attribué trop de points. Réattribuez les points.")
            } else {
                attaque = pointsAttaque
                defense = pointsDefense
                endurance = pointsEndurance
                vitesse = pointsVitesse

            }
        }

        // Calculer les points de vie maximum en fonction de l'endurance
        val pointsDeVieMax = endurance * 10

        // Créer le personnage avec les valeurs saisies par l'utilisateur
        val hero = Personnage(nom, pointsDeVieMax, pointsDeVieMax, attaque, defense, endurance, vitesse, armePrincipal = null, armure = null )

        // Valoriser l'attribut joueur avec le personnage créé et le retourner
        this.joueur = hero
        return hero
    }

    

}