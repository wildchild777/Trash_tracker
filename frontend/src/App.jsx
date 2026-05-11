import './App.css'
import 'leaflet/dist/leaflet.css';
import { MapContainer, TileLayer } from 'react-leaflet';

function App() {
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
          </MapContainer>
        </div>
      </section>
    </>
  )
}

export default App
