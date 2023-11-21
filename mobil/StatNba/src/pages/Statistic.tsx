// src/App.tsx
import React from 'react';
import { IonContent, IonHeader, IonPage, IonTitle, IonToolbar, IonGrid, IonRow, IonCol } from '@ionic/react';

const playerStats = [
  { name: 'Stephen Curry', points: 20, rebounds: 10, assists: 5 },
  { name: 'Kevin Durant', points: 15, rebounds: 8, assists: 3 },
  { name: 'Giannis Antetokounmpo', points: 25, rebounds: 12, assists: 7 },
];

const Stat: React.FC = () => (
  <IonPage>
    <IonHeader>
      <IonToolbar>
        <IonTitle>Ionic NBA Player Stats</IonTitle>
      </IonToolbar>
    </IonHeader>
    <IonContent className="ion-padding">
      <IonGrid>
        <IonRow>
          <IonCol>Name</IonCol>
          <IonCol>Points</IonCol>
          <IonCol>Rebounds</IonCol>
          <IonCol>Assists</IonCol>
        </IonRow>
        {playerStats.map((player, index) => (
          <IonRow key={index}>
            <IonCol>{player.name}</IonCol>
            <IonCol>{player.points}</IonCol>
            <IonCol>{player.rebounds}</IonCol>
            <IonCol>{player.assists}</IonCol>
          </IonRow>
        ))}
      </IonGrid>
    </IonContent>
  </IonPage>
);

export default Stat;
