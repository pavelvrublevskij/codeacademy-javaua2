import React from 'react';
import Welcome from "../components/Welcome";

function App() {
	return (
		<div>
			<Welcome user={{
				name: "Petras",
				surname: "Petraitis"
			}} salary={1500}/>
		</div>
	);
}

export default App;
