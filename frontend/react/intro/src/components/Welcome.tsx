
const Welcome = ({
  user,
  salary,
}: any) => {

	return (
		<>
			<div>
				Hello, {user.name} {user.surname}!
			</div>
			<div>
				Your salary is <strong>{salary}</strong>
			</div>
		</>
	)
}

export default Welcome;
