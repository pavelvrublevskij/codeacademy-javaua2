const ContentContainer = () => {
	const onSubmitEvent = (event: any) => {
		event.preventDefault();
		console.log(event);
		console.log(event.target[0].value);
	}

	return (
		<>
			<form id="myForm" onSubmit={onSubmitEvent}>
				<label htmlFor="fname">First name:</label>
				<input type="text" id="fname" name="fname"/><br/><br/>
				<label htmlFor="lname">Last name:</label>
				<input type="text" id="lname" name="lname"/><br/><br/>
				<input type="submit" value="Submit"/>
			</form>
		</>
	)
}

export default ContentContainer;
