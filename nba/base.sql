CREATE TABLE equipe (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nom VARCHAR(50),
    ville VARCHAR(50)
);

CREATE TABLE joueur (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nom VARCHAR(50),
    equipe_id INT,
    FOREIGN KEY (equipe_id) REFERENCES equipe(id)
);

CREATE TABLE jeu (
    id INT PRIMARY KEY AUTO_INCREMENT,
    dte DATETIME,
    lieu VARCHAR(100),
    equipe1_id INT,
    equipe2_id INT,
    FOREIGN KEY (equipe1_id) REFERENCES equipe(id),
    FOREIGN KEY (equipe2_id) REFERENCES equipe(id)
);

CREATE TABLE resultat_match (
    id INT PRIMARY KEY AUTO_INCREMENT,
    match_id INT,
    joueur_id INT,
    nb_passe INT,
    nb_passe_decisive INT,
    nb_rebond INT,
    nb_tir_3_pts_marque INT,
    nb_tir_3_pts_tente INT,
    nb_tir_sans_lance_franc INT,
    nb_lance_franc_marque INT,
    nb_lance_franc_tentes INT,
    temps_total_joue DECIMAL(5,2),
    FOREIGN KEY (match_id) REFERENCES jeu(id),
    FOREIGN KEY (joueur_id) REFERENCES joueur(id)
);

CREATE VIEW statistique AS
SELECT
    joueur.equipe_id as equipeId,
    joueur.id AS joueur_id,
    joueur.nom AS joueur_nom,
    COUNT(resultat_match.match_id) AS nb_match,
    SUM(resultat_match.nb_tir_3_pts_marque) AS point_marque,
    AVG(resultat_match.nb_rebond) AS rebond_moy,
    AVG(resultat_match.nb_passe) AS passe_moy,
    AVG(resultat_match.nb_passe_decisive) AS passe_decisive_moy,
    (SUM(resultat_match.nb_tir_3_pts_marque) / SUM(resultat_match.nb_tir_3_pts_tente)) * 100 AS pct_3_points,
    (SUM(resultat_match.nb_lance_franc_marque) / SUM(resultat_match.nb_lance_franc_tentes)) * 100 AS pct_lance_franc,
    (SUM(resultat_match.nb_lance_franc_tentes) / COUNT(resultat_match.match_id)) AS minute_par_match,
    SUM(resultat_match.temps_total_joue) AS temps_total_joue
FROM
    joueur
        LEFT JOIN resultat_match ON joueur.id = resultat_match.joueur_id
GROUP BY
    joueur.id;


