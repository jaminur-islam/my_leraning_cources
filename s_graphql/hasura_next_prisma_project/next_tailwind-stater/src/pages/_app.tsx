import Head from "next/head";
import { AppProps } from "next/app";
import "../styles/index.css";
import { ApolloProvider } from "@apollo/client";
import apolloClient from "../../lib/apolloClients";

function MyApp({ Component, pageProps }: AppProps) {
  return (
    <>
      <Head>
        <title>NextJS TailwindCSS TypeScript Starter</title>
        <meta name="viewport" content="initial-scale=1.0, width=device-width" />
      </Head>
      <ApolloProvider client={apolloClient}>
        <Component {...pageProps} />
      </ApolloProvider>
    </>
  );
}

export default MyApp;
