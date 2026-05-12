import './App.css'
import 'leaflet/dist/leaflet.css';
import LocationFinder from './LocationFinder';
import { MapContainer, TileLayer, Marker, Polyline } from 'react-leaflet';
import { useState } from 'react';

function App() {
  const [trashData, setTrashData] = useState(null);
  const [pinPosition, setPinPosition] = useState(null);

  const handleLocationSelect = async (coords) => {
    try {
      setPinPosition(coords);
      const response = await fetch(`http://localhost:8080/api/flow?lat=${coords.lat}&lng=${coords.lng}`);
      const data = await response.json();
      setTrashData(data);
      console.log("Data from backend:", data);
    } catch (error) {
      console.error("Error from the backend: ", error);
    }
  }

  return (
    <>
      <section id="top">
        <div>
          <h2 style={{ textAlign: 'center' }}>This is going to be Trash tracker.</h2>
        </div>
      </section>
      <section id="center">
        <div id="map">
          <MapContainer center={[19.1870, 72.8489]} zoom={16} scrollWheelZoom={false} style={{ height: '800px', width: '70%', margin: '0 auto' }}>
            <TileLayer
              attribution='&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors'
              url='https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png'
            />
            <LocationFinder onLocationSelect={handleLocationSelect} />
            {pinPosition && <Marker position={pinPosition} />}
            {trashData && trashData.destinations.map((dest, index) =>
              <Polyline key={index} positions={[
                [pinPosition.lat, pinPosition.lng],
                [dest.lat, dest.lng]
              ]} color="red" />
            )}
          </MapContainer>
        </div>
      </section>
    </>
  )
}

export default App
