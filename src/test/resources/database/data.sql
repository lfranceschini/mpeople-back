-- ------------------TV_OUTIL------------------

INSERT INTO tv_outil (label, version) VALUES ('talend', '5.6');
INSERT INTO tv_outil (label, version) VALUES ('eclipse', '5.6');

-- ------------------TV_LANGAGE-----------------

INSERT INTO tv_langage (label, version) VALUES ('java', '1.8');
INSERT INTO tv_langage (label, version) VALUES ('C#', '2');

-- ------------------TV_METHODO-----------------

INSERT INTO tv_methodo (label, version) VALUES ('merise', '2');
INSERT INTO tv_methodo (label, version) VALUES ('UML', '2');

-- ------------------TV_DOMAINE-----------------

INSERT INTO tv_domaine (label) VALUES ('retail');
INSERT INTO tv_domaine (label) VALUES ('assurance');

-- ------------------TV_CLIENT-----------------

INSERT INTO tv_client (label, tv_domaine_id) VALUES ('auchan', 0);
INSERT INTO tv_client (label, tv_domaine_id) VALUES ('axa', 1);