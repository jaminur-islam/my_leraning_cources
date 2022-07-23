import { useQuery, gql } from "@apollo/client";

const ALL_PRODUCT = gql`
  query my_Product($_gt: Int = 10) {
    Product(where: { id: { _gt: $_gt } }) {
      id
      name
      price
    }
  }
`;

export default function Home() {
  const { loading, error, data } = useQuery(ALL_PRODUCT, {
    variables: { _gt: 2 },
  });
  console.log({ data, error, loading });

  return (
    <div className="container sb flex items-center p-4 mx-auto min-h-screen justify-center">
      <h1> New project </h1>
    </div>
  );
}
