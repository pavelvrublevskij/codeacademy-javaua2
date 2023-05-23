import React from 'react';
import Welcome from "../components/Welcome";

function App() {
	const text = 'Coder';
	return (
		<div>
			<Welcome name={"Petras"} surname={"Petraitis"}/>
		</div>
	);
}

export default App;
