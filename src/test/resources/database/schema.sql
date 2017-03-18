------------------------------------------------
-- Table mission
-- -----------------------------------------------------
CREATE TABLE mission (
  id INT PRIMARY KEY,
  poste_client VARCHAR(100) NOT NULL,
  tjm INT NOT NULL ,
  date_debut DATE NOT NULL ,
  date_fin DATE NULL ,
  description VARCHAR(500) NOT NULL ,
  titre VARCHAR(100) NOT NULL ,
  PRIMARY KEY (id)  );


-- -----------------------------------------------------
-- Table tv_alerte
-- -----------------------------------------------------
CREATE TABLE tv_alerte (
  id INT NOT NULL PRIMARY KEY ,
  label VARCHAR(45) NOT NULL ,
  PRIMARY KEY (id)  )

;


-- -----------------------------------------------------
-- Table tv_pole
-- -----------------------------------------------------
CREATE TABLE tv_pole (
  id INT NOT NULL PRIMARY KEY ,
  label VARCHAR(45) NOT NULL ,
  PRIMARY KEY (id)  )
;


-- -----------------------------------------------------
-- Table tv_poste
-- -----------------------------------------------------
CREATE TABLE tv_poste (
  id INT NOT NULL PRIMARY KEY ,
  label VARCHAR(45) NOT NULL ,
  PRIMARY KEY (id)  )
;


-- -----------------------------------------------------
-- Table tv_type_collaborateur
-- -----------------------------------------------------
CREATE TABLE tv_type_collaborateur (
  id INT NOT NULL PRIMARY KEY ,
  label VARCHAR(45) NOT NULL ,
  PRIMARY KEY (id)  )
;


-- -----------------------------------------------------
-- Table collaborateur
-- -----------------------------------------------------
CREATE TABLE collaborateur (
  matricule VARCHAR(10) NOT NULL ,
  nom VARCHAR(45) NOT NULL ,
  prenom VARCHAR(45) NOT NULL ,
  date_naissance DATE NOT NULL ,
  date_arrivee DATE NULL ,
  email VARCHAR(45) NOT NULL ,
  login VARCHAR(45) NULL ,
  mot_de_passe VARCHAR(45) NULL ,
  date_sortie DATE NULL ,
  photo VARCHAR(45) NULL ,
  tv_type_collaborateur_id INT NOT NULL ,
  tv_pole_id INT NOT NULL ,
  tv_alerte_id INT NULL ,
  tv_poste_id INT NOT NULL ,
  mission_id INT NULL ,
  PRIMARY KEY (matricule)  ,
  CONSTRAINT fk_collaborateur_mission1
  FOREIGN KEY (mission_id)
  REFERENCES mission (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_collaborateur_tv_alerte1
  FOREIGN KEY (tv_alerte_id)
  REFERENCES tv_alerte (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_collaborateur_tv_pole1
  FOREIGN KEY (tv_pole_id)
  REFERENCES tv_pole (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_collaborateur_tv_poste1
  FOREIGN KEY (tv_poste_id)
  REFERENCES tv_poste (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_collaborateur_tv_type_collaborateur1
  FOREIGN KEY (tv_type_collaborateur_id)
  REFERENCES tv_type_collaborateur (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)

;


-- -----------------------------------------------------
-- Table action
-- -----------------------------------------------------
CREATE TABLE action (
  id INT NOT NULL PRIMARY KEY ,
  label VARCHAR(45) NOT NULL ,
  collaborateur_matricule VARCHAR(10) NOT NULL ,
  deadline DATE NULL ,
  commentaire VARCHAR(500) NULL ,
  priorite INT NULL ,
  PRIMARY KEY (id)  ,
  CONSTRAINT fk_action_collaborateur1
  FOREIGN KEY (collaborateur_matricule)
  REFERENCES collaborateur (matricule)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)

;


-- -----------------------------------------------------
-- Table tv_formation_type
-- -----------------------------------------------------
CREATE TABLE tv_formation_type (
  id INT NOT NULL PRIMARY KEY ,
  label VARCHAR(45) NOT NULL ,
  PRIMARY KEY (id)  )

;


-- -----------------------------------------------------
-- Table tv_formation
-- -----------------------------------------------------
CREATE TABLE tv_formation (
  id INT NOT NULL PRIMARY KEY ,
  label VARCHAR(45) NOT NULL ,
  tv_formation_type_id INT NOT NULL ,
  PRIMARY KEY (id)  ,
  CONSTRAINT fk_tv_formation_tv_formation_type1
  FOREIGN KEY (tv_formation_type_id)
  REFERENCES tv_formation_type (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)

;


-- -----------------------------------------------------
-- Table ass_collaborateur_formation
-- -----------------------------------------------------
CREATE TABLE ass_collaborateur_formation (
  collaborateur_matricule VARCHAR(10) NOT NULL ,
  tv_formation_id INT NOT NULL ,
  date_debut DATE NOT NULL ,
  date_fin VARCHAR(45) NOT NULL ,
  PRIMARY KEY (collaborateur_matricule, tv_formation_id)  ,
  CONSTRAINT fk_ass_collaborateur_formation_collaborateur1
  FOREIGN KEY (collaborateur_matricule)
  REFERENCES collaborateur (matricule)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_ass_collaborateur_formation_tv_formation1
  FOREIGN KEY (tv_formation_id)
  REFERENCES tv_formation (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)

;


-- -----------------------------------------------------
-- Table tv_langage
-- -----------------------------------------------------
CREATE TABLE tv_langage (
  id INT NOT NULL PRIMARY KEY ,
  label VARCHAR(45) NOT NULL ,
  version INT NOT NULL ,
  PRIMARY KEY (id)  )

;


-- -----------------------------------------------------
-- Table ass_collaborateur_langage
-- -----------------------------------------------------
CREATE TABLE ass_collaborateur_langage (
  collaborateur_matricule VARCHAR(10) NOT NULL ,
  tv_langage_id INT NOT NULL ,
  niveau VARCHAR(45) NOT NULL ,
  PRIMARY KEY (collaborateur_matricule, tv_langage_id)  ,
  CONSTRAINT fk_ass_collaborateur_langage_collaborateur1
  FOREIGN KEY (collaborateur_matricule)
  REFERENCES collaborateur (matricule)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_ass_collaborateur_langage_tv_langage1
  FOREIGN KEY (tv_langage_id)
  REFERENCES tv_langage (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)

;


-- -----------------------------------------------------
-- Table tv_langue
-- -----------------------------------------------------
CREATE TABLE tv_langue (
  id INT NOT NULL PRIMARY KEY ,
  label VARCHAR(45) NOT NULL ,
  PRIMARY KEY (id)  )

;


-- -----------------------------------------------------
-- Table ass_collaborateur_langue
-- -----------------------------------------------------
CREATE TABLE ass_collaborateur_langue (
  tv_langue_id INT NOT NULL ,
  collaborateur_matricule VARCHAR(10) NOT NULL ,
  PRIMARY KEY (tv_langue_id, collaborateur_matricule)  ,
  CONSTRAINT fk_ass_collaborateur_langue_collaborateur1
  FOREIGN KEY (collaborateur_matricule)
  REFERENCES collaborateur (matricule)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_ass_collaborateur_langue_tv_langue1
  FOREIGN KEY (tv_langue_id)
  REFERENCES tv_langue (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)

;


-- -----------------------------------------------------
-- Table tv_outil
-- -----------------------------------------------------
CREATE TABLE tv_outil (
  id INT NOT NULL IDENTITY  PRIMARY KEY ,
  label VARCHAR(45) NOT NULL ,
  version VARCHAR(45) NOT NULL ,
  PRIMARY KEY (id)  )

;


-- -----------------------------------------------------
-- Table ass_collaborateur_outil
-- -----------------------------------------------------
CREATE TABLE ass_collaborateur_outil (
  collaborateur_matricule VARCHAR(10) NOT NULL ,
  tv_outil_id INT NOT NULL ,
  niveau INT NOT NULL ,
  PRIMARY KEY (collaborateur_matricule, tv_outil_id)  ,
  CONSTRAINT fk_ass_collaborateur_outil_collaborateur1
  FOREIGN KEY (collaborateur_matricule)
  REFERENCES collaborateur (matricule)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_ass_collaborateur_outil_tv_outil1
  FOREIGN KEY (tv_outil_id)
  REFERENCES tv_outil (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)

;


-- -----------------------------------------------------
-- Table ass_langage_mission
-- -----------------------------------------------------
CREATE TABLE ass_langage_mission (
  tv_langage_id INT NOT NULL ,
  mission_id INT NOT NULL ,
  PRIMARY KEY (tv_langage_id, mission_id)  ,
  CONSTRAINT fk_ass_langage_mission_mission1
  FOREIGN KEY (mission_id)
  REFERENCES mission (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_ass_langage_mission_tv_langage1
  FOREIGN KEY (tv_langage_id)
  REFERENCES tv_langage (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)

;


-- -----------------------------------------------------
-- Table tv_methodo
-- -----------------------------------------------------
CREATE TABLE tv_methodo (
  id INT NOT NULL PRIMARY KEY ,
  label VARCHAR(45) NOT NULL ,
  version INT NOT NULL ,
  PRIMARY KEY (id)  )

;


-- -----------------------------------------------------
-- Table ass_methodo_mission
-- -----------------------------------------------------
CREATE TABLE ass_methodo_mission (
  mission_id INT NOT NULL ,
  tv_methodo_id INT NOT NULL ,
  PRIMARY KEY (mission_id, tv_methodo_id)  ,
  CONSTRAINT fk_ass_methodo_mission_mission1
  FOREIGN KEY (mission_id)
  REFERENCES mission (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_ass_methodo_mission_tv_methodo1
  FOREIGN KEY (tv_methodo_id)
  REFERENCES tv_methodo (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)

;


-- -----------------------------------------------------
-- Table ass_outil_mission
-- -----------------------------------------------------
CREATE TABLE ass_outil_mission (
  tv_outil_id INT NOT NULL ,
  mission_id INT NOT NULL ,
  PRIMARY KEY (tv_outil_id, mission_id)  ,
  CONSTRAINT fk_ass_outil_mission_mission1
  FOREIGN KEY (mission_id)
  REFERENCES mission (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_ass_outil_mission_tv_outil1
  FOREIGN KEY (tv_outil_id)
  REFERENCES tv_outil (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)

;


-- -----------------------------------------------------
-- Table tv_domaine
-- -----------------------------------------------------
CREATE TABLE tv_domaine (
  id INT NOT NULL PRIMARY KEY ,
  label VARCHAR(45) NOT NULL ,
  PRIMARY KEY (id)  )

;


-- -----------------------------------------------------
-- Table tv_client
-- -----------------------------------------------------
CREATE TABLE tv_client (
  id INT NOT NULL PRIMARY KEY ,
  label VARCHAR(45) NOT NULL ,
  tv_domaine_id INT NOT NULL ,
  PRIMARY KEY (id)  ,
  CONSTRAINT fk_tv_client_tv_domaine1
  FOREIGN KEY (tv_domaine_id)
  REFERENCES tv_domaine (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)

;


-- -----------------------------------------------------
-- Table tv_status_rdv
-- -----------------------------------------------------
CREATE TABLE tv_status_rdv (
  id INT NOT NULL ,
  label VARCHAR(45) NOT NULL ,
  couleur INT NULL ,
  PRIMARY KEY (id)  )

;


-- -----------------------------------------------------
-- Table tv_type_rdv
-- -----------------------------------------------------
CREATE TABLE tv_type_rdv (
  id INT NOT NULL PRIMARY KEY ,
  label VARCHAR(45) NOT NULL ,
  picto VARCHAR(45) NULL ,
  PRIMARY KEY (id)  )

;


-- -----------------------------------------------------
-- Table rendez_vous
-- -----------------------------------------------------
CREATE TABLE rendez_vous (
  id INT NOT NULL PRIMARY KEY ,
  tv_type_rdv_id INT NOT NULL ,
  tv_status_rdv_id INT NOT NULL ,
  tv_client_id INT NOT NULL ,
  date DATETIME NOT NULL ,
  PRIMARY KEY (id)  ,
  CONSTRAINT fk_rendez_vous_tv_client1
  FOREIGN KEY (tv_client_id)
  REFERENCES tv_client (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_rendez_vous_tv_status_rdv1
  FOREIGN KEY (tv_status_rdv_id)
  REFERENCES tv_status_rdv (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_rendez_vous_tv_type_rdv1
  FOREIGN KEY (tv_type_rdv_id)
  REFERENCES tv_type_rdv (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)

;


-- -----------------------------------------------------
-- Table ass_rendez_vous_collaborateur
-- -----------------------------------------------------
CREATE TABLE ass_rendez_vous_collaborateur (
  rendez_vous_id INT NOT NULL ,
  collaborateur_matricule VARCHAR(10) NOT NULL ,
  PRIMARY KEY (rendez_vous_id, collaborateur_matricule)  ,
  CONSTRAINT fk_ass_rendez_vous_collaborateur_collaborateur1
  FOREIGN KEY (collaborateur_matricule)
  REFERENCES collaborateur (matricule)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_ass_rendez_vous_collaborateur_rendez_vous1
  FOREIGN KEY (rendez_vous_id)
  REFERENCES rendez_vous (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)

;


-- -----------------------------------------------------
-- Table hierarchie
-- -----------------------------------------------------
CREATE TABLE hierarchie (
  collaborateur_matricule VARCHAR(10) NOT NULL ,
  chef_id VARCHAR(10) NOT NULL ,
  PRIMARY KEY (collaborateur_matricule)  ,
  CONSTRAINT fk_hierarchie_collaborateur1
  FOREIGN KEY (chef_id)
  REFERENCES collaborateur (matricule)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_hierarchie_collaborateur2
  FOREIGN KEY (collaborateur_matricule)
  REFERENCES collaborateur (matricule)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)

;


-- -----------------------------------------------------
-- Table histo_collaborateur_mission
-- -----------------------------------------------------
CREATE TABLE histo_collaborateur_mission (
  collaborateur_matricule VARCHAR(10) NOT NULL ,
  mission_id INT NOT NULL ,
  date_debut DATE NOT NULL ,
  date_fin DATE NOT NULL ,
  PRIMARY KEY (collaborateur_matricule, mission_id)  ,
  CONSTRAINT fk_histo_collaborateur_mission_collaborateur1
  FOREIGN KEY (collaborateur_matricule)
  REFERENCES collaborateur (matricule)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_histo_collaborateur_mission_mission1
  FOREIGN KEY (mission_id)
  REFERENCES mission (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)

;


-- -----------------------------------------------------
-- Table histo_collaborateur_poste
-- -----------------------------------------------------
CREATE TABLE histo_collaborateur_poste (
  collaborateur_matricule VARCHAR(10) NOT NULL ,
  tv_poste_id INT NOT NULL ,
  date_debut DATE NOT NULL ,
  date_fin DATE NOT NULL ,
  PRIMARY KEY (collaborateur_matricule, tv_poste_id)  ,
  CONSTRAINT fk_histo_collaborateur_poste_collaborateur1
  FOREIGN KEY (collaborateur_matricule)
  REFERENCES collaborateur (matricule)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_histo_collaborateur_poste_tv_poste1
  FOREIGN KEY (tv_poste_id)
  REFERENCES tv_poste (id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)

;


-- -----------------------------------------------------
-- Table salaire
-- -----------------------------------------------------
CREATE TABLE salaire (
  collaborateur_matricule VARCHAR(10) NOT NULL ,
  date DATE NOT NULL ,
  montant_fixe INT NOT NULL ,
  variable INT NOT NULL ,
  PRIMARY KEY (collaborateur_matricule, date)  ,
  CONSTRAINT fk_salaire_collaborateur1
  FOREIGN KEY (collaborateur_matricule)
  REFERENCES collaborateur (matricule)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)

;
