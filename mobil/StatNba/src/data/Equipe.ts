export interface Equipe {
    nom: string;
    id: number;
  
  }
  
  const equipes: Equipe[] = [
    {
        nom: "Stephen Curry",
        id: 1
    },
    {
      nom: "Kevin Durant",
      id:1
    },
    {
      nom: "Giannis Antetokounmpo",
      id: 2
    },
    {
      nom: "Klay Thompson",
      id: 2
    }
    
  ];
  
  export const getequipes = () => equipes;
  
  export const getequipe = (id: number) => equipes.find(m => m.id === id);
  