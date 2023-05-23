interface User {
	name: string;      // required
	surname?: string;  // ? - means optional
}

const Welcome = (props: User) => {
	return (
		<>
			Hello, {props.name} {props.surname}!
		</>
	)
}

export default Welcome;
