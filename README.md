📚 Application de Notation des Professeurs
Une application Java connectée à Firebase permettant la gestion centralisée des notes, des absences et des réclamations dans un établissement scolaire.

🎯 Objectifs
Digitaliser la gestion des notes (contrôles, examens, participation)

Automatiser le calcul des moyennes en tenant compte des absences

Améliorer la communication entre étudiants, professeurs et administration

Offrir une interface intuitive adaptée à chaque rôle utilisateur

👥 Utilisateurs & Rôles
👨‍🏫 Professeurs
Saisie, modification et suppression des notes

Visualisation des statistiques de performance des étudiants

👨‍🎓 Étudiants
Consultation des notes et des moyennes

Visualisation de l'impact des absences

Dépôt et suivi des plaintes

🧑‍💼 Administrateurs
Création et gestion des comptes utilisateurs

Suivi des absences avec application de pénalités

Traitement des plaintes déposées

🛠️ Technologies utilisées
Java (avec interface graphique)

Firebase

Authentification

Firestore (base de données cloud)

Sécurité des données via des règles d'accès

🧱 Architecture
Architecture client-serveur

Synchronisation en temps réel via listeners Firebase

Séparation des collections :

users, students, professors, administrators

grades, absences, complaints

🧪 Fonctionnalités principales
🔐 Authentification sécurisée

📝 Gestion complète des notes

❌ Gestion des absences avec système de pénalités personnalisable

📊 Statistiques et tableaux de bord

📮 Gestion des réclamations
