import axios from 'axios';

export interface Equipe {
  id: string;
  nom: string;
  ville: string;
}

const apiUrl = 'https://votre-api.com/messages';

export const getEquipes = async (): Promise<Equipe[]> => {
  try {
    const response = await axios.get<Equipe[]>(apiUrl);
    return response.data;
  } catch (error) {
    console.error('Erreur de chargement des messages :');
    return [];
  }
};

export const getEquipe = async (id: number): Promise<Equipe | undefined> => {
  try {
    const response = await axios.get<Equipe>(`${apiUrl}/${id}`);
    return response.data;
  } catch (error) {
    console.error('Erreur de chargement du message :');
    return undefined;
  }
};
