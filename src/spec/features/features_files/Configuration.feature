@tag
Feature: Ajouter une configuration
  En tant qu utilisateur je souhaite ajouter un enseignant

  Background: 
    Given Je me connecte sur l application Studiffy
    When Je saisis l adresse mail "marwalakrab@gmail.com"
    And Je saisis le motde passe "Password@123"
    And Je clique sur le bouton se connecter
    Then Je me redirige vers la page Dashbord "Tableaux de board"
  
  @ajouter
  Scenario: Ajouter une configuration
  When Je clique sur Planification
  And Je Clique sur Configuration
  And Je clique sur le bouton Ajouter configuration
  And Je saisis le nom "Gahda"
  And Je saisis Durée "120"
  And Je saisis l heure de debut matin "09:00"
  And Je saisis l heure de fin matin "10:00"
  And Je choisis les jours "lundi" "jeudi"
  And Je saisis l heure de debut apres midi "01:00"
  And Je saisis l heure de fin apres midi "02:00"
  And Je choisis les jours "lundi" "jeudi"
  And Je saisis l heure de debut pause dejeuner "12:30"
  And Je saisis l heure de fin pause dejeuner "01:00"
  And Je saisis l heure de debut pause "03:00"
  And Je saisis l heure de fin pause "03:30"
  And Je clique sur le bouton Ajouter
  And Je clique sur bouton ok du pop up
  Then une nouvelle configuration s affiche dans la liste des configuration "Ghada"
  
  