import React from 'react';
import HeaderContainer from "./Header/HeaderContainer";
import ContentContainer from "./Content/ContentContainer";
import FooterContainer from "./Footer/FooterContainer";
import './App.css';

function App() {
	return (
		<div className={'mainApp'}>
			<HeaderContainer/>
			<ContentContainer/>
			<FooterContainer/>
		</div>
	);
}

export default App;
