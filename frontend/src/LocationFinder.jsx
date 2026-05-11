import { useMapEvents } from 'react-leaflet';

function LocationFinder({ onLocationSelect }) {
    const map = useMapEvents({
        click(e) {
            onLocationSelect(e.latlng);
        },
    })
    return null;
}

export default LocationFinder;