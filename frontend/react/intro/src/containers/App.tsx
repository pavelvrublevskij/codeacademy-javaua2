import React from 'react';
import Welcome from "../components/Welcome";

function App() {
	const welcome =
		<Welcome user={{
			name: "Petras",
			surname: "Petraitis"
		}} salary={1500}/>;

	const loopOf5Welcome = () => {
		return Array.from(Array(5).keys())
			.map((val) => welcome);
	}

	return (
		<div>
			{loopOf5Welcome()}
		</div>
	);
}

export default App;
