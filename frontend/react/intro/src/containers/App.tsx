import React from 'react';
import Welcome from "../components/Welcome";

function App() {
	return (
		<div>
			<Welcome name={"Petras"} surname={"Petraitis"} />
			<br/>
			<Welcome name={"Antanas"} />
		</div>
	);
}

export default App;
