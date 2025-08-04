# AI-Agent-italyre
// Auto-refresh every 5 minutes with new properties
const refreshInterval = setInterval(() => {
  console.log("Auto-refreshing properties...");
  
  // Generate a new property with random data
  const newProperty = {
    id: properties.length + 1,
    title: `Nuova Proprietà Aggiunta ${new Date().toLocaleTimeString()}`,
    price: Math.floor(Math.random() * 1000000) + 200000,
    location: ["Milano", "Roma", "Firenze", "Torino", "Venezia", "Napoli"][Math.floor(Math.random() * 6)],
    bedrooms: Math.floor(Math.random() * 4) + 1,
    bathrooms: Math.floor(Math.random() * 3) + 1,
    size: Math.floor(Math.random() * 200) + 80,
    type: ["Appartamento", "Villa", "Attico", "Casa Storica"][Math.floor(Math.random() * 4)],
    image: `https://placehold.co/400x300/${Math.floor(Math.random()*16777215).toString(16)}/ffffff?text=New+Property`,
    description: "Nuova proprietà aggiunta automaticamente dal sistema di aggiornamento in tempo reale.",
    features: ["Ascensore", "Cantina", "Aria Condizionata", "Terrazzo"].slice(0, Math.floor(Math.random() * 4) + 1),
    views: Math.floor(Math.random() * 1000),
    published: "Adesso"
  };
  
  // Add new property to the top of the list
  setProperties(prev => [newProperty, ...prev]);
  setFilteredProperties(prev => [newProperty, ...prev]);
}, 300000); // 5 minutes
