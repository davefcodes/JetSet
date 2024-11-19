fetch("frontend/trips.json")
    .then((response) => response.json())
    .then((trips) => {renderTrips(trips);})
    .catch((error) => console.error("Error fetching trips:", error));

function renderTrips(trips){
    const tripList = document.getElementById("trip-list");

    tripList.innerHTML = trips.map(
            (trip) => `
        <div class="bg-white shadow-md rounded-lg p-6 mb-4">
            <h2 class="text-lg font-bold font-workSans text-gray-800">${trip.destination}</h2>
            <p class="text-gray-600 font-workSans"><strong>Reason:</strong> ${trip.reason}</p>
            <p class="text-gray-600 font-workSans"><strong>Arrival:</strong> ${trip.arrivaldate}</p>
            <p class="text-gray-600 font-workSans"><strong>Departure:</strong> ${trip.departuredate}</p>
         </div>`
        )
        .join("");
}
renderTrips(trips)
