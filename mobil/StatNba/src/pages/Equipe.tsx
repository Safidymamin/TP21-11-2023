// src/App.tsx
import React from 'react';
import { IonContent, IonHeader, IonPage, IonTitle, IonToolbar, IonList, IonItem } from '@ionic/react';

const teams = ['Team 1', 'Team 2', 'Team 3']; // Remplacez ceci par vos équipes NBA réelles

const Equipe: React.FC = () => (
  <IonPage>
    <IonHeader>
      <IonToolbar>
        <IonTitle>Ionic NBA Teams</IonTitle>
      </IonToolbar>
    </IonHeader>
    <IonContent className="ion-padding">
      <IonList>
        {teams.map((team, index) => (
          <IonItem key={index}>
            {team}
          </IonItem>
        ))}
      </IonList>
    </IonContent>
  </IonPage>
);

export default Equipe;
