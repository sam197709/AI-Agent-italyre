// Auto-refresh every 5 minutes with new properties
useEffect(() => {
  if (!loading) {
    const refreshInterval = setInterval(() => {
      console.log("Auto-refreshing properties...");
      
      // Generate a new property with random data
      const newProperty = {
        id: properties.length + 1,
        title: `Nuova Proprietà Aggiunta ${new Date().toLocaleTimeString()}`,
        price: Math.floor(Math.random() * 1000000) + 200000,
        // ... altri dettagli generati dinamicamente
      };
      
      // Add new property to the top of the list
      setProperties(prev => [newProperty, ...prev]);
      setFilteredProperties(prev => [newProperty, ...prev]);
    }, 300000); // 5 minutes

    return () => clearInterval(refreshInterval);
  }
}, [loading, properties]);
