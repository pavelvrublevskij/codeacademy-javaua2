import React from 'react';
import Login from "./Login";

function App() {
	return (
		<div>
			Uzd 1:
			<br/>
			pagal salyga ar admin ar user surenderint atitinkama rezultata (panaudoti skirtingus komponentus)
			<hr/>
			<Login value={'admin'}/>
		</div>
	);
}

export default App;
