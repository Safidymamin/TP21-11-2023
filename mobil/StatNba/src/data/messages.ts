export interface Message {
  nom: string;
  ville: string;
  id: number;

}

const messages: Message[] = [
  {
    nom: 'Warriors',
    ville: "Amerique",
    id:1
  },
  {
      nom: "Brooklyn_Nets",
      ville: "Amerique",
      id:2
  }
];

export const getMessages = () => messages;

export const getMessage = (id: number) => messages.find(m => m.id === id);
