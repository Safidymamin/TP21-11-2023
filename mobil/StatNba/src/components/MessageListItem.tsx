import {
  IonItem,
  IonLabel,
  IonNote
  } from '@ionic/react';
import { Message } from '../data/messages';
import './MessageListItem.css';

interface MessageListItemProps {
  message: Message;
}

const MessageListItem: React.FC<MessageListItemProps> = ({ message }) => {
  return (
    <IonItem routerLink={`/message/${message.id}`} detail={false}>
      <div slot="start" className="dot dot-unread"></div>
      <IonLabel className="ion-text-wrap">
        <h2>
          {message.nom}
          <span className="date">
            <IonNote>////</IonNote>
          </span>
        </h2>
        <h2>{message.ville}</h2>
        <p>
        
        </p>
      </IonLabel>
    </IonItem>
  );


};

export default MessageListItem;
