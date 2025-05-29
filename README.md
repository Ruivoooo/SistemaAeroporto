CRIAR O BANCO NESSA ORDEM 

CREATE TABLE `aeronave` (
   `IdAeronave` int NOT NULL AUTO_INCREMENT,
   `Modelo` varchar(50) NOT NULL,
   `Capacidade` int NOT NULL,
   `Fabricante` varchar(50) NOT NULL,
   PRIMARY KEY (`IdAeronave`)
 ) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci



 CREATE TABLE `voo` (
   `IdVoo` int NOT NULL AUTO_INCREMENT,
   `Origem` varchar(50) NOT NULL,
   `Destino` varchar(50) NOT NULL,
   `DataHoraPartida` datetime NOT NULL,
   `DataHoraChegada` datetime NOT NULL,
   `Status` varchar(25) NOT NULL,
   `AeronaveId` int NOT NULL,
   PRIMARY KEY (`IdVoo`),
   KEY `AeronaveId` (`AeronaveId`),
   CONSTRAINT `voo_ibfk_1` FOREIGN KEY (`AeronaveId`) REFERENCES `aeronave` (`IdAeronave`)
 ) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci




CREATE TABLE `passageiro` (
   `IdPassageiro` int NOT NULL AUTO_INCREMENT,
   `Nome` varchar(70) NOT NULL,
   `CPFOUPassaport` varchar(40) NOT NULL,
   `contato` varchar(20) NOT NULL,
   PRIMARY KEY (`IdPassageiro`)
 ) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci



CREATE TABLE `passagem` (
   `IdPassagem` int NOT NULL AUTO_INCREMENT,
   `Assento` varchar(15) NOT NULL,
   `Classe` varchar(15) NOT NULL,
   `StatusPgto` varchar(20) NOT NULL,
   `VooId` int NOT NULL,
   `IdPassageiro` int NOT NULL,
   PRIMARY KEY (`IdPassagem`),
   KEY `VooId` (`VooId`),
   KEY `IdPassageiro` (`IdPassageiro`),
   CONSTRAINT `passagem_ibfk_1` FOREIGN KEY (`VooId`) REFERENCES `voo` (`IdVoo`),
   CONSTRAINT `passagem_ibfk_2` FOREIGN KEY (`IdPassageiro`) REFERENCES `passageiro` (`IdPassageiro`)
 ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci



CREATE TABLE `checkin` (
   `IdCheckIn` int NOT NULL AUTO_INCREMENT,
   `qtdDespachadaBgm` int NOT NULL,
   `DataHora` datetime NOT NULL,
   `IdPassagem` int NOT NULL,
   PRIMARY KEY (`IdCheckIn`),
   KEY `IdPassagem` (`IdPassagem`),
   CONSTRAINT `checkin_ibfk_1` FOREIGN KEY (`IdPassagem`) REFERENCES `passagem` (`IdPassagem`)
 ) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci




CREATE TABLE `bagagem` (
   `IdBagagem` int NOT NULL AUTO_INCREMENT,
   `PesoKg` double(8,2) DEFAULT NULL,
   `DestinoFinal` varchar(50) DEFAULT NULL,
   `Status` varchar(20) DEFAULT NULL,
   `IdCheckIn` int NOT NULL,
   PRIMARY KEY (`IdBagagem`),
   KEY `IdCheckIn` (`IdCheckIn`),
   CONSTRAINT `bagagem_ibfk_1` FOREIGN KEY (`IdCheckIn`) REFERENCES `checkin` (`IdCheckIn`)
 ) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
